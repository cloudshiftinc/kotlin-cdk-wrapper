package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.ec2.InstanceSize

public open class AcceleratorType
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType,
) {
    public companion object {
        public fun of(
            acceleratorClass: AcceleratorClass,
            instanceSize: InstanceSize
        ): AcceleratorType =
            software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType.of(
                    acceleratorClass.let(AcceleratorClass::unwrap),
                    instanceSize.let(InstanceSize::unwrap)
                )
                .let(AcceleratorType::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType
        ): AcceleratorType = AcceleratorType(cdkObject)

        internal fun unwrap(
            wrapped: AcceleratorType
        ): software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType = wrapped.cdkObject
    }
}
