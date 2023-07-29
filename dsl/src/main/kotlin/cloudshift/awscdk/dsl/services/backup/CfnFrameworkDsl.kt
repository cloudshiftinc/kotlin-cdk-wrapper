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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnFramework
import software.constructs.Construct

/**
 * Creates a framework with one or more controls.
 *
 * A framework is a collection of controls that you can use to evaluate your backup practices. By
 * using pre-built customizable controls to define your policies, you can evaluate whether your
 * backup practices comply with your policies and which resources are not yet in compliance.
 *
 * For a sample AWS CloudFormation template, see the
 * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/bam-cfn-integration.html#bam-cfn-frameworks-template)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object controlScope;
 * CfnFramework cfnFramework = CfnFramework.Builder.create(this, "MyCfnFramework")
 * .frameworkControls(List.of(FrameworkControlProperty.builder()
 * .controlName("controlName")
 * // the properties below are optional
 * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .controlScope(controlScope)
 * .build()))
 * // the properties below are optional
 * .frameworkDescription("frameworkDescription")
 * .frameworkName("frameworkName")
 * .frameworkTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html)
 */
@CdkDslMarker
public class CfnFrameworkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFramework.Builder = CfnFramework.Builder.create(scope, id)

    private val _frameworkControls: MutableList<Any> = mutableListOf()

    private val _frameworkTags: MutableList<Any> = mutableListOf()

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     *
     * @param frameworkControls Contains detailed information about all of the controls of a
     *   framework.
     */
    public fun frameworkControls(vararg frameworkControls: Any) {
        _frameworkControls.addAll(listOf(*frameworkControls))
    }

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     *
     * @param frameworkControls Contains detailed information about all of the controls of a
     *   framework.
     */
    public fun frameworkControls(frameworkControls: Collection<Any>) {
        _frameworkControls.addAll(frameworkControls)
    }

    /**
     * Contains detailed information about all of the controls of a framework.
     *
     * Each framework must contain at least one control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkcontrols)
     *
     * @param frameworkControls Contains detailed information about all of the controls of a
     *   framework.
     */
    public fun frameworkControls(frameworkControls: IResolvable) {
        cdkBuilder.frameworkControls(frameworkControls)
    }

    /**
     * An optional description of the framework with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkdescription)
     *
     * @param frameworkDescription An optional description of the framework with a maximum 1,024
     *   characters.
     */
    public fun frameworkDescription(frameworkDescription: String) {
        cdkBuilder.frameworkDescription(frameworkDescription)
    }

    /**
     * The unique name of a framework.
     *
     * This name is between 1 and 256 characters, starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworkname)
     *
     * @param frameworkName The unique name of a framework.
     */
    public fun frameworkName(frameworkName: String) {
        cdkBuilder.frameworkName(frameworkName)
    }

    /**
     * A list of tags with which to tag your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     *
     * @param frameworkTags A list of tags with which to tag your framework.
     */
    public fun frameworkTags(vararg frameworkTags: Any) {
        _frameworkTags.addAll(listOf(*frameworkTags))
    }

    /**
     * A list of tags with which to tag your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     *
     * @param frameworkTags A list of tags with which to tag your framework.
     */
    public fun frameworkTags(frameworkTags: Collection<Any>) {
        _frameworkTags.addAll(frameworkTags)
    }

    /**
     * A list of tags with which to tag your framework.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html#cfn-backup-framework-frameworktags)
     *
     * @param frameworkTags A list of tags with which to tag your framework.
     */
    public fun frameworkTags(frameworkTags: IResolvable) {
        cdkBuilder.frameworkTags(frameworkTags)
    }

    public fun build(): CfnFramework {
        if (_frameworkControls.isNotEmpty()) cdkBuilder.frameworkControls(_frameworkControls)
        if (_frameworkTags.isNotEmpty()) cdkBuilder.frameworkTags(_frameworkTags)
        return cdkBuilder.build()
    }
}
