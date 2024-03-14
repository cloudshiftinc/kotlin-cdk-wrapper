package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String

public open class CpuArchitecture
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.CpuArchitecture,
) {
    public companion object {
        public fun of(cpuArchitecture: String): CpuArchitecture =
            software.amazon.awscdk.services.ecs.CpuArchitecture.of(cpuArchitecture)
                .let(CpuArchitecture::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.CpuArchitecture
        ): CpuArchitecture = CpuArchitecture(cdkObject)

        internal fun unwrap(
            wrapped: CpuArchitecture
        ): software.amazon.awscdk.services.ecs.CpuArchitecture = wrapped.cdkObject
    }
}
