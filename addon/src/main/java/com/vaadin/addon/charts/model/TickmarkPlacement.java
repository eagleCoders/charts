package com.vaadin.addon.charts.model;

/*-
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2019 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

/**
 * For categorized axes only. If ON the tick mark is placed in the center of the
 * category, if BETWEEN the tick mark is placed between categories. Defaults to
 * BETWEEN.
 */
public enum TickmarkPlacement implements ChartEnum {
    ON("on"), BETWEEN("between");

    private final String tickmarkPlacement;

    private TickmarkPlacement(String tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
    }

    @Override
    public String toString() {
        return tickmarkPlacement;
    }
}
