/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2021 Arcane Arts (Volmit Software)
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

package com.volmit.iris.util.nbt.mca.palettes;

import com.volmit.iris.util.nbt.tag.CompoundTag;
import com.volmit.iris.util.nbt.tag.ListTag;

import java.util.function.Predicate;

public interface DataPalette {
    int getIndex(CompoundTag var1);

    boolean a(Predicate<CompoundTag> var1);

    CompoundTag getByIndex(int var1);

    int a();

    int b();

    void replace(ListTag<CompoundTag> t);

    ListTag<CompoundTag> getPalette();
}