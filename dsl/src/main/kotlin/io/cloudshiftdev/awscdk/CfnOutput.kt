package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOutput
internal constructor(
    private val cdkObject: software.amazon.awscdk.CfnOutput,
) : CfnElement(cdkObject) {
    /**
     * A condition to associate with this output value.
     *
     * If the condition evaluates to `false`, this output value will not be included in the stack.
     *
     * Default: - No condition is associated with the output.
     */
    public open fun condition(): CfnCondition? =
        unwrap(this).getCondition()?.let(CfnCondition::wrap)

    /**
     * A condition to associate with this output value.
     *
     * If the condition evaluates to `false`, this output value will not be included in the stack.
     *
     * Default: - No condition is associated with the output.
     */
    public open fun condition(`value`: CfnCondition) {
        unwrap(this).setCondition(`value`.let(CfnCondition::unwrap))
    }

    /**
     * A String type that describes the output value.
     *
     * The description can be a maximum of 4 K in length.
     *
     * Default: - No description.
     */
    public open fun description(): String? = unwrap(this).getDescription()

    /**
     * A String type that describes the output value.
     *
     * The description can be a maximum of 4 K in length.
     *
     * Default: - No description.
     */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * The name used to export the value of this output across stacks.
     *
     * To use the value in another stack, pass the value of `output.importValue` to it.
     *
     * Default: - the output is not exported
     */
    public open fun exportName(): String? = unwrap(this).getExportName()

    /**
     * The name used to export the value of this output across stacks.
     *
     * To use the value in another stack, pass the value of `output.importValue` to it.
     *
     * Default: - the output is not exported
     */
    public open fun exportName(`value`: String) {
        unwrap(this).setExportName(`value`)
    }

    /**
     * Return the `Fn.importValue` expression to import this value into another stack.
     *
     * The returned value should not be used in the same stack, but in a different one. It must be
     * deployed to the same environment, as CloudFormation exports can only be imported in the same
     * Region and account.
     *
     * The is no automatic registration of dependencies between stacks when using this mechanism, so
     * you should make sure to deploy them in the right order yourself.
     *
     * You can use this mechanism to share values across Stacks in different Stages. If you intend
     * to share the value to another Stack inside the same Stage, the automatic cross-stack
     * referencing mechanism is more convenient.
     */
    public open fun importValue(): String = unwrap(this).getImportValue()

    /**
     * The value of the property returned by the aws cloudformation describe-stacks command.
     *
     * The value of an output can include literals, parameter references, pseudo-parameters, a
     * mapping value, or intrinsic functions.
     */
    public open fun `value`(): Any = unwrap(this).getValue()

    /**
     * The value of the property returned by the aws cloudformation describe-stacks command.
     *
     * The value of an output can include literals, parameter references, pseudo-parameters, a
     * mapping value, or intrinsic functions.
     */
    public open fun `value`(`value`: Any) {
        unwrap(this).setValue(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.CfnOutput]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A condition to associate with this output value.
         *
         * If the condition evaluates to `false`, this output value will not be included in the
         * stack.
         *
         * Default: - No condition is associated with the output.
         *
         * @param condition A condition to associate with this output value.
         */
        public fun condition(condition: CfnCondition)

        /**
         * A String type that describes the output value.
         *
         * The description can be a maximum of 4 K in length.
         *
         * Default: - No description.
         *
         * @param description A String type that describes the output value.
         */
        public fun description(description: String)

        /**
         * The name used to export the value of this output across stacks.
         *
         * To import the value from another stack, use `Fn.importValue(exportName)`.
         *
         * Default: - the output is not exported
         *
         * @param exportName The name used to export the value of this output across stacks.
         */
        public fun exportName(exportName: String)

        /**
         * The key of the property returned by aws cloudformation describe-stacks command.
         *
         * @param key The key of the property returned by aws cloudformation describe-stacks
         *   command.
         */
        public fun key(key: String)

        /**
         * The value of the property returned by the aws cloudformation describe-stacks command.
         *
         * The value of an output can include literals, parameter references, pseudo-parameters, a
         * mapping value, or intrinsic functions.
         *
         * @param value The value of the property returned by the aws cloudformation describe-stacks
         *   command.
         */
        public fun `value`(`value`: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.CfnOutput.Builder =
            software.amazon.awscdk.CfnOutput.Builder.create(scope, id)

        /**
         * A condition to associate with this output value.
         *
         * If the condition evaluates to `false`, this output value will not be included in the
         * stack.
         *
         * Default: - No condition is associated with the output.
         *
         * @param condition A condition to associate with this output value.
         */
        override fun condition(condition: CfnCondition) {
            cdkBuilder.condition(condition.let(CfnCondition::unwrap))
        }

        /**
         * A String type that describes the output value.
         *
         * The description can be a maximum of 4 K in length.
         *
         * Default: - No description.
         *
         * @param description A String type that describes the output value.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The name used to export the value of this output across stacks.
         *
         * To import the value from another stack, use `Fn.importValue(exportName)`.
         *
         * Default: - the output is not exported
         *
         * @param exportName The name used to export the value of this output across stacks.
         */
        override fun exportName(exportName: String) {
            cdkBuilder.exportName(exportName)
        }

        /**
         * The key of the property returned by aws cloudformation describe-stacks command.
         *
         * @param key The key of the property returned by aws cloudformation describe-stacks
         *   command.
         */
        override fun key(key: String) {
            cdkBuilder.key(key)
        }

        /**
         * The value of the property returned by the aws cloudformation describe-stacks command.
         *
         * The value of an output can include literals, parameter references, pseudo-parameters, a
         * mapping value, or intrinsic functions.
         *
         * @param value The value of the property returned by the aws cloudformation describe-stacks
         *   command.
         */
        override fun `value`(`value`: String) {
            cdkBuilder.`value`(`value`)
        }

        public fun build(): software.amazon.awscdk.CfnOutput = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnOutput {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnOutput(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.CfnOutput): CfnOutput =
            CfnOutput(cdkObject)

        internal fun unwrap(wrapped: CfnOutput): software.amazon.awscdk.CfnOutput =
            wrapped.cdkObject
    }
}
