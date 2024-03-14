package io.cloudshiftdev.awscdk.services.cognito

public interface ICustomAttribute {
    /** Bind this custom attribute type to the values as expected by CloudFormation. */
    public fun bind(): CustomAttributeConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute,
    ) : ICustomAttribute {
        /** Bind this custom attribute type to the values as expected by CloudFormation. */
        override fun bind(): CustomAttributeConfig =
            unwrap(this).bind().let(CustomAttributeConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.ICustomAttribute
        ): ICustomAttribute = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ICustomAttribute
        ): software.amazon.awscdk.services.cognito.ICustomAttribute = (wrapped as Wrapper).cdkObject
    }
}
