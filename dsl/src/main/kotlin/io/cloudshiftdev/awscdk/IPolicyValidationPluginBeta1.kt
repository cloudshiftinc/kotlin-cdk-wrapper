package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.collections.List

public interface IPolicyValidationPluginBeta1 {
    /** The name of the plugin that will be displayed in the validation report. */
    public fun name(): String

    /**
     * The list of rule IDs that the plugin will evaluate.
     *
     * Used for analytics purposes.
     *
     * Default: - No rule is reported
     */
    public fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

    /**
     * The method that will be called by the CDK framework to perform validations.
     *
     * This is where the plugin will evaluate the CloudFormation templates for compliance and report
     * and violations
     *
     * @param context
     */
    public fun validate(context: IPolicyValidationContextBeta1): PolicyValidationPluginReportBeta1

    /**
     * The version of the plugin, following the Semantic Versioning specification (see
     * https://semver.org/). This version is used for analytics purposes, to measure the usage of
     * different plugins and different versions. The value of this property should be kept in sync
     * with the actual version of the software package. If the version is not provided or is not a
     * valid semantic version, it will be reported as `0.0.0`.
     */
    public fun version(): String? = unwrap(this).getVersion()

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1,
    ) : IPolicyValidationPluginBeta1 {
        /** The name of the plugin that will be displayed in the validation report. */
        override fun name(): String = unwrap(this).getName()

        /**
         * The list of rule IDs that the plugin will evaluate.
         *
         * Used for analytics purposes.
         *
         * Default: - No rule is reported
         */
        override fun ruleIds(): List<String> = unwrap(this).getRuleIds() ?: emptyList()

        /**
         * The method that will be called by the CDK framework to perform validations.
         *
         * This is where the plugin will evaluate the CloudFormation templates for compliance and
         * report and violations
         *
         * @param context
         */
        override fun validate(
            context: IPolicyValidationContextBeta1
        ): PolicyValidationPluginReportBeta1 =
            unwrap(this)
                .validate(context.let(IPolicyValidationContextBeta1::unwrap))
                .let(PolicyValidationPluginReportBeta1::wrap)

        /**
         * The version of the plugin, following the Semantic Versioning specification (see
         * https://semver.org/). This version is used for analytics purposes, to measure the usage
         * of different plugins and different versions. The value of this property should be kept in
         * sync with the actual version of the software package. If the version is not provided or
         * is not a valid semantic version, it will be reported as `0.0.0`.
         */
        override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.IPolicyValidationPluginBeta1
        ): IPolicyValidationPluginBeta1 = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IPolicyValidationPluginBeta1
        ): software.amazon.awscdk.IPolicyValidationPluginBeta1 = (wrapped as Wrapper).cdkObject
    }
}
