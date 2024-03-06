@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Describes the experiment options for an experiment template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * ExperimentTemplateExperimentOptionsProperty experimentTemplateExperimentOptionsProperty =
 * ExperimentTemplateExperimentOptionsProperty.builder()
 * .accountTargeting("accountTargeting")
 * .emptyTargetResolutionMode("emptyTargetResolutionMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplateexperimentoptions.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateExperimentOptionsPropertyDsl {
    private val cdkBuilder:
        CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty.builder()

    /** @param accountTargeting The account targeting setting for an experiment template. */
    public fun accountTargeting(accountTargeting: String) {
        cdkBuilder.accountTargeting(accountTargeting)
    }

    /**
     * @param emptyTargetResolutionMode The empty target resolution mode for an experiment template.
     */
    public fun emptyTargetResolutionMode(emptyTargetResolutionMode: String) {
        cdkBuilder.emptyTargetResolutionMode(emptyTargetResolutionMode)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty =
        cdkBuilder.build()
}
