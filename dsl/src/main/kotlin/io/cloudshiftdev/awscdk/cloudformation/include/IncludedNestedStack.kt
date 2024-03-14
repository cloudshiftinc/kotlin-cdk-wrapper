package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.NestedStack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface IncludedNestedStack {
    /**
     * The CfnInclude that represents the template, which can be used to access Resources and other
     * template elements.
     */
    public fun includedTemplate(): CfnInclude

    /** The NestedStack object which represents the scope of the template. */
    public fun stack(): NestedStack

    /** A builder for [IncludedNestedStack] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param includedTemplate The CfnInclude that represents the template, which can be used to
         *   access Resources and other template elements.
         */
        public fun includedTemplate(includedTemplate: CfnInclude)

        /** @param stack The NestedStack object which represents the scope of the template. */
        public fun stack(stack: NestedStack)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.cloudformation.include.IncludedNestedStack.Builder =
            software.amazon.awscdk.cloudformation.include.IncludedNestedStack.builder()

        /**
         * @param includedTemplate The CfnInclude that represents the template, which can be used to
         *   access Resources and other template elements.
         */
        override fun includedTemplate(includedTemplate: CfnInclude) {
            cdkBuilder.includedTemplate(includedTemplate.let(CfnInclude::unwrap))
        }

        /** @param stack The NestedStack object which represents the scope of the template. */
        override fun stack(stack: NestedStack) {
            cdkBuilder.stack(stack.let(NestedStack::unwrap))
        }

        public fun build(): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack,
    ) : IncludedNestedStack {
        /**
         * The CfnInclude that represents the template, which can be used to access Resources and
         * other template elements.
         */
        override fun includedTemplate(): CfnInclude =
            unwrap(this).getIncludedTemplate().let(CfnInclude::wrap)

        /** The NestedStack object which represents the scope of the template. */
        override fun stack(): NestedStack = unwrap(this).getStack().let(NestedStack::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): IncludedNestedStack {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.cloudformation.include.IncludedNestedStack
        ): IncludedNestedStack = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IncludedNestedStack
        ): software.amazon.awscdk.cloudformation.include.IncludedNestedStack =
            (wrapped as Wrapper).cdkObject
    }
}
