package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IOptionGroup : IResource {
    /**
     * Adds a configuration to this OptionGroup.
     *
     * This method is a no-op for an imported OptionGroup.
     *
     * @param configuration
     * @return true if the OptionConfiguration was successfully added.
     */
    public fun addConfiguration(configuration: OptionConfiguration): Boolean

    /**
     * Adds a configuration to this OptionGroup.
     *
     * This method is a no-op for an imported OptionGroup.
     *
     * @param configuration
     * @return true if the OptionConfiguration was successfully added.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
    public fun addConfiguration(configuration: OptionConfiguration.Builder.() -> Unit): Boolean

    /** The name of the option group. */
    public fun optionGroupName(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.rds.IOptionGroup,
    ) : IOptionGroup {
        /**
         * Adds a configuration to this OptionGroup.
         *
         * This method is a no-op for an imported OptionGroup.
         *
         * @param configuration
         * @return true if the OptionConfiguration was successfully added.
         */
        override fun addConfiguration(configuration: OptionConfiguration): Boolean =
            unwrap(this).addConfiguration(configuration.let(OptionConfiguration::unwrap))

        /**
         * Adds a configuration to this OptionGroup.
         *
         * This method is a no-op for an imported OptionGroup.
         *
         * @param configuration
         * @return true if the OptionConfiguration was successfully added.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
        override fun addConfiguration(
            configuration: OptionConfiguration.Builder.() -> Unit
        ): Boolean = addConfiguration(OptionConfiguration(configuration))

        /**
         * Apply the given removal policy to this resource.
         *
         * The Removal Policy controls what happens to this resource when it stops being managed by
         * CloudFormation, either because you've removed it from the CDK application or because
         * you've made a change that requires the resource to be replaced.
         *
         * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS account for
         * data recovery and cleanup later (`RemovalPolicy.RETAIN`).
         *
         * @param policy
         */
        override fun applyRemovalPolicy(policy: RemovalPolicy) {
            unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
        }

        /**
         * The environment this resource belongs to.
         *
         * For resources that are created and managed by the CDK (generally, those created by
         * creating new class instances like Role, Bucket, etc.), this is always the same as the
         * environment of the stack they belong to; however, for imported resources (those obtained
         * from static methods like fromRoleArn, fromBucketName, etc.), that might be different than
         * the stack they were imported into.
         */
        override fun env(): ResourceEnvironment =
            unwrap(this).getEnv().let(ResourceEnvironment::wrap)

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The name of the option group. */
        override fun optionGroupName(): String = unwrap(this).getOptionGroupName()

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.IOptionGroup
        ): IOptionGroup = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IOptionGroup
        ): software.amazon.awscdk.services.rds.IOptionGroup = (wrapped as Wrapper).cdkObject
    }
}
