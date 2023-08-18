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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.constructs.Construct

/**
 * This resource creates an app block.
 *
 * App blocks store details about the virtual hard disk that contains the files for the application
 * in an S3 bucket. It also stores the setup script with details about how to mount the virtual hard
 * disk. App blocks are only supported for Elastic fleets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnAppBlock cfnAppBlock = CfnAppBlock.Builder.create(this, "MyCfnAppBlock")
 * .name("name")
 * .sourceS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .displayName("displayName")
 * .packagingType("packagingType")
 * .postSetupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .setupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html)
 */
@CdkDslMarker
public class CfnAppBlockDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAppBlock.Builder = CfnAppBlock.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-description)
     *
     * @param description The description of the app block.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The display name of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-displayname)
     *
     * @param displayName The display name of the app block.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The name of the app block.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-name)
     *
     * @param name The name of the app block.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The packaging type of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-packagingtype)
     *
     * @param packagingType The packaging type of the app block.
     */
    public fun packagingType(packagingType: String) {
        cdkBuilder.packagingType(packagingType)
    }

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     *
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
        cdkBuilder.postSetupScriptDetails(postSetupScriptDetails)
    }

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     *
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    public fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
        cdkBuilder.postSetupScriptDetails(postSetupScriptDetails)
    }

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     *
     * @param setupScriptDetails The setup script details of the app block.
     */
    public fun setupScriptDetails(setupScriptDetails: IResolvable) {
        cdkBuilder.setupScriptDetails(setupScriptDetails)
    }

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     *
     * @param setupScriptDetails The setup script details of the app block.
     */
    public fun setupScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
        cdkBuilder.setupScriptDetails(setupScriptDetails)
    }

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     *
     * @param sourceS3Location The source S3 location of the app block.
     */
    public fun sourceS3Location(sourceS3Location: IResolvable) {
        cdkBuilder.sourceS3Location(sourceS3Location)
    }

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     *
     * @param sourceS3Location The source S3 location of the app block.
     */
    public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty) {
        cdkBuilder.sourceS3Location(sourceS3Location)
    }

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     *
     * @param tags The tags of the app block.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     *
     * @param tags The tags of the app block.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAppBlock {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
