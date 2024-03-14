package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IEnvironment : IResource {
    /**
     * Adds an extension association to the environment.
     *
     * @param extension The extension to create an association for.
     */
    public fun addExtension(extension: IExtension)

    /** The application associated with the environment. */
    public fun application(): IApplication? = unwrap(this).getApplication()?.let(IApplication::wrap)

    /** The ID of the application associated to the environment. */
    public fun applicationId(): String

    /** The description of the environment. */
    public fun description(): String? = unwrap(this).getDescription()

    /** The Amazon Resource Name (ARN) of the environment. */
    public fun environmentArn(): String

    /** The ID of the environment. */
    public fun environmentId(): String

    /** The monitors for the environment. */
    public fun monitors(): List<Monitor> =
        unwrap(this).getMonitors()?.map(Monitor::wrap) ?: emptyList()

    /** The name of the environment. */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Adds an extension defined by the action point and event destination and also creates an
     * extension association to the environment.
     *
     * @param actionPoint The action point which triggers the event.
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun on(actionPoint: ActionPoint, eventDestination: IEventDestination)

    /**
     * Adds an extension defined by the action point and event destination and also creates an
     * extension association to the environment.
     *
     * @param actionPoint The action point which triggers the event.
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun on(
        actionPoint: ActionPoint,
        eventDestination: IEventDestination,
        options: ExtensionOptions,
    )

    /**
     * Adds an extension defined by the action point and event destination and also creates an
     * extension association to the environment.
     *
     * @param actionPoint The action point which triggers the event.
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
    public fun on(
        actionPoint: ActionPoint,
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit,
    )

    /**
     * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates
     * an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentBaking(eventDestination: IEventDestination)

    /**
     * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates
     * an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentBaking(eventDestination: IEventDestination, options: ExtensionOptions)

    /**
     * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates
     * an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
    public fun onDeploymentBaking(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    /**
     * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
     * an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentComplete(eventDestination: IEventDestination)

    /**
     * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
     * an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentComplete(eventDestination: IEventDestination, options: ExtensionOptions)

    /**
     * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
     * an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
    public fun onDeploymentComplete(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    /**
     * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
     * creates an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentRolledBack(eventDestination: IEventDestination)

    /**
     * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
     * creates an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentRolledBack(
        eventDestination: IEventDestination,
        options: ExtensionOptions
    )

    /**
     * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
     * creates an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
    public fun onDeploymentRolledBack(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    /**
     * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentStart(eventDestination: IEventDestination)

    /**
     * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentStart(eventDestination: IEventDestination, options: ExtensionOptions)

    /**
     * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
    public fun onDeploymentStart(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    /**
     * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentStep(eventDestination: IEventDestination)

    /**
     * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun onDeploymentStep(eventDestination: IEventDestination, options: ExtensionOptions)

    /**
     * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
    public fun onDeploymentStep(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    /**
     * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
     * and also creates an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination)

    /**
     * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
     * and also creates an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun preCreateHostedConfigurationVersion(
        eventDestination: IEventDestination,
        options: ExtensionOptions
    )

    /**
     * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
     * and also creates an extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
    public fun preCreateHostedConfigurationVersion(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    /**
     * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun preStartDeployment(eventDestination: IEventDestination)

    /**
     * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    public fun preStartDeployment(eventDestination: IEventDestination, options: ExtensionOptions)

    /**
     * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
     * extension association to the environment.
     *
     * @param eventDestination The event that occurs during the extension.
     * @param options Options for the extension.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
    public fun preStartDeployment(
        eventDestination: IEventDestination,
        options: ExtensionOptions.Builder.() -> Unit
    )

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appconfig.IEnvironment,
    ) : IEnvironment {
        /**
         * Adds an extension association to the environment.
         *
         * @param extension The extension to create an association for.
         */
        override fun addExtension(extension: IExtension) {
            unwrap(this).addExtension(extension.let(IExtension::unwrap))
        }

        /** The application associated with the environment. */
        override fun application(): IApplication? =
            unwrap(this).getApplication()?.let(IApplication::wrap)

        /** The ID of the application associated to the environment. */
        override fun applicationId(): String = unwrap(this).getApplicationId()

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

        /** The description of the environment. */
        override fun description(): String? = unwrap(this).getDescription()

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

        /** The Amazon Resource Name (ARN) of the environment. */
        override fun environmentArn(): String = unwrap(this).getEnvironmentArn()

        /** The ID of the environment. */
        override fun environmentId(): String = unwrap(this).getEnvironmentId()

        /** The monitors for the environment. */
        override fun monitors(): List<Monitor> =
            unwrap(this).getMonitors()?.map(Monitor::wrap) ?: emptyList()

        /** The name of the environment. */
        override fun name(): String? = unwrap(this).getName()

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /**
         * Adds an extension defined by the action point and event destination and also creates an
         * extension association to the environment.
         *
         * @param actionPoint The action point which triggers the event.
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
            unwrap(this)
                .on(
                    actionPoint.let(ActionPoint::unwrap),
                    eventDestination.let(IEventDestination::unwrap)
                )
        }

        /**
         * Adds an extension defined by the action point and event destination and also creates an
         * extension association to the environment.
         *
         * @param actionPoint The action point which triggers the event.
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun on(
            actionPoint: ActionPoint,
            eventDestination: IEventDestination,
            options: ExtensionOptions,
        ) {
            unwrap(this)
                .on(
                    actionPoint.let(ActionPoint::unwrap),
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds an extension defined by the action point and event destination and also creates an
         * extension association to the environment.
         *
         * @param actionPoint The action point which triggers the event.
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
        override fun on(
            actionPoint: ActionPoint,
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit,
        ): Unit = on(actionPoint, eventDestination, ExtensionOptions(options))

        /**
         * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentBaking(eventDestination: IEventDestination) {
            unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap))
        }

        /**
         * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentBaking(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .onDeploymentBaking(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
        override fun onDeploymentBaking(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = onDeploymentBaking(eventDestination, ExtensionOptions(options))

        /**
         * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentComplete(eventDestination: IEventDestination) {
            unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap))
        }

        /**
         * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentComplete(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .onDeploymentComplete(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
        override fun onDeploymentComplete(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = onDeploymentComplete(eventDestination, ExtensionOptions(options))

        /**
         * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
            unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap))
        }

        /**
         * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentRolledBack(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .onDeploymentRolledBack(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
        override fun onDeploymentRolledBack(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = onDeploymentRolledBack(eventDestination, ExtensionOptions(options))

        /**
         * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentStart(eventDestination: IEventDestination) {
            unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap))
        }

        /**
         * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentStart(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .onDeploymentStart(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
        override fun onDeploymentStart(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = onDeploymentStart(eventDestination, ExtensionOptions(options))

        /**
         * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates
         * an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentStep(eventDestination: IEventDestination) {
            unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap))
        }

        /**
         * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates
         * an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun onDeploymentStep(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .onDeploymentStep(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates
         * an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
        override fun onDeploymentStep(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = onDeploymentStep(eventDestination, ExtensionOptions(options))

        /**
         * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event
         * destination and also creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
            unwrap(this)
                .preCreateHostedConfigurationVersion(
                    eventDestination.let(IEventDestination::unwrap)
                )
        }

        /**
         * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event
         * destination and also creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun preCreateHostedConfigurationVersion(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .preCreateHostedConfigurationVersion(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event
         * destination and also creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
        override fun preCreateHostedConfigurationVersion(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

        /**
         * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun preStartDeployment(eventDestination: IEventDestination) {
            unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap))
        }

        /**
         * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        override fun preStartDeployment(
            eventDestination: IEventDestination,
            options: ExtensionOptions
        ) {
            unwrap(this)
                .preStartDeployment(
                    eventDestination.let(IEventDestination::unwrap),
                    options.let(ExtensionOptions::unwrap)
                )
        }

        /**
         * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also
         * creates an extension association to the environment.
         *
         * @param eventDestination The event that occurs during the extension.
         * @param options Options for the extension.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
        override fun preStartDeployment(
            eventDestination: IEventDestination,
            options: ExtensionOptions.Builder.() -> Unit
        ): Unit = preStartDeployment(eventDestination, ExtensionOptions(options))

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.IEnvironment
        ): IEnvironment = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IEnvironment
        ): software.amazon.awscdk.services.appconfig.IEnvironment = (wrapped as Wrapper).cdkObject
    }
}
