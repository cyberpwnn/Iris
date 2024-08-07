/*
 *  Iris is a World Generator for Minecraft Bukkit Servers
 *  Copyright (c) 2024 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.util.matter.slices;

import com.volmit.iris.util.matter.Sliced;
import com.volmit.iris.util.nbt.tag.CompoundTag;

@Sliced
public class CompoundMatter extends NBTMatter<CompoundTag> {
    public static final CompoundTag EMPTY = new CompoundTag();

    public CompoundMatter() {
        this(1, 1, 1);
    }

    public CompoundMatter(int width, int height, int depth) {
        super(width, height, depth, CompoundTag.class, EMPTY);
    }
}
