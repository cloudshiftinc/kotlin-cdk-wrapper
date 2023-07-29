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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnHub
import software.constructs.Construct

/**
 * The `AWS::SecurityHub::Hub` resource specifies the enablement of the AWS Security Hub service in
 * your AWS account .
 *
 * The service is enabled in the current AWS Region or the specified Region. You create a separate
 * `Hub` resource in each Region in which you want to enable Security Hub .
 *
 * When you use this resource to enable Security Hub , default security standards are enabled. To
 * disable default standards, set the `EnableDefaultStandards` property to `false` . You can use the
 * [`AWS::SecurityHub::Standard`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
 * resource to enable additional standards.
 *
 * When you use this resource to enable Security Hub , new controls are automatically enabled for
 * your enabled standards. To disable automatic enablement of new controls, set the
 * `AutoEnableControls` property to `false` .
 *
 * You must create an `AWS::SecurityHub::Hub` resource for an account before you can create other
 * types of Security Hub resources for the account through AWS CloudFormation . Use a
 * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * , such as `"DependsOn": "Hub"` , to ensure that you've created an `AWS::SecurityHub::Hub`
 * resource before creating other Security Hub resources for an account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * Object tags;
 * CfnHub cfnHub = CfnHub.Builder.create(this, "MyCfnHub")
 * .autoEnableControls(false)
 * .controlFindingGenerator("controlFindingGenerator")
 * .enableDefaultStandards(false)
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html)
 */
@CdkDslMarker
public class CfnHubDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHub.Builder = CfnHub.Builder.create(scope, id)

    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     *
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     *   standards that are enabled.
     */
    public fun autoEnableControls(autoEnableControls: Boolean) {
        cdkBuilder.autoEnableControls(autoEnableControls)
    }

    /**
     * Whether to automatically enable new controls when they are added to standards that are
     * enabled.
     *
     * By default, this is set to `true` , and new controls are enabled automatically. To not
     * automatically enable new controls, set this to `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
     *
     * @param autoEnableControls Whether to automatically enable new controls when they are added to
     *   standards that are enabled.
     */
    public fun autoEnableControls(autoEnableControls: IResolvable) {
        cdkBuilder.autoEnableControls(autoEnableControls)
    }

    /**
     * Specifies whether an account has consolidated control findings turned on or off.
     *
     * If the value for this field is set to `SECURITY_CONTROL` , Security Hub generates a single
     * finding for a control check even when the check applies to multiple enabled standards.
     *
     * If the value for this field is set to `STANDARD_CONTROL` , Security Hub generates separate
     * findings for a control check when the check applies to multiple enabled standards.
     *
     * The value for this field in a member account matches the value in the administrator account.
     * For accounts that aren't part of an organization, the default value of this field is
     * `SECURITY_CONTROL` if you enabled Security Hub on or after February 23, 2023.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-controlfindinggenerator)
     *
     * @param controlFindingGenerator Specifies whether an account has consolidated control findings
     *   turned on or off.
     */
    public fun controlFindingGenerator(controlFindingGenerator: String) {
        cdkBuilder.controlFindingGenerator(controlFindingGenerator)
    }

    /**
     * Whether to enable the security standards that Security Hub has designated as automatically
     * enabled.
     *
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security
     * Hub . If you don't want to enable the designated standards, set `EnableDefaultStandards` to
     * `false` .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
     *
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     *   designated as automatically enabled.
     */
    public fun enableDefaultStandards(enableDefaultStandards: Boolean) {
        cdkBuilder.enableDefaultStandards(enableDefaultStandards)
    }

    /**
     * Whether to enable the security standards that Security Hub has designated as automatically
     * enabled.
     *
     * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
     * designated standards are automatically enabled in each AWS Region where you enable Security
     * Hub . If you don't want to enable the designated standards, set `EnableDefaultStandards` to
     * `false` .
     *
     * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
     * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
     *
     * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
     *   designated as automatically enabled.
     */
    public fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
        cdkBuilder.enableDefaultStandards(enableDefaultStandards)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnHub = cdkBuilder.build()
}
