package dev.jdtech.jellyfin.film.presentation.library

import java.util.UUID
import org.jellyfin.sdk.model.api.BaseItemKind

sealed interface LibraryEvent {
    data class PlayRandomItem(
        val itemId: UUID,
        val itemKind: BaseItemKind,
        val parentId: UUID,
        val includeTypes: List<BaseItemKind>,
    ) : LibraryEvent
}