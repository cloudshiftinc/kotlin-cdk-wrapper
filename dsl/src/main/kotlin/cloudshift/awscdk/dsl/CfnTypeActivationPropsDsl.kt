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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CfnTypeActivationProps
import software.amazon.awscdk.IResolvable

/**
 * Properties for defining a `CfnTypeActivation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnTypeActivationProps cfnTypeActivationProps = CfnTypeActivationProps.builder()
 * .autoUpdate(false)
 * .executionRoleArn("executionRoleArn")
 * .loggingConfig(LoggingConfigProperty.builder()
 * .logGroupName("logGroupName")
 * .logRoleArn("logRoleArn")
 * .build())
 * .majorVersion("majorVersion")
 * .publicTypeArn("publicTypeArn")
 * .publisherId("publisherId")
 * .type("type")
 * .typeName("typeName")
 * .typeNameAlias("typeNameAlias")
 * .versionBump("versionBump")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html)
 */
@CdkDslMarker
public class CfnTypeActivationPropsDsl {
    private val cdkBuilder: CfnTypeActivationProps.Builder = CfnTypeActivationProps.builder()

    /**
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     *   when a new *minor* version is published by the extension publisher. Major versions released
     *   by the publisher must be manually updated.
     *
     * The default is `true` .
     */
    public fun autoUpdate(autoUpdate: Boolean) {
        cdkBuilder.autoUpdate(autoUpdate)
    }

    /**
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     *   when a new *minor* version is published by the extension publisher. Major versions released
     *   by the publisher must be manually updated.
     *
     * The default is `true` .
     */
    public fun autoUpdate(autoUpdate: IResolvable) {
        cdkBuilder.autoUpdate(autoUpdate)
    }

    /**
     * @param executionRoleArn The name of the IAM execution role to use to activate the extension.
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /** @param loggingConfig Specifies logging configuration information for an extension. */
    public fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /** @param loggingConfig Specifies logging configuration information for an extension. */
    public fun loggingConfig(loggingConfig: IResolvable) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * @param majorVersion The major version of this extension you want to activate, if multiple
     *   major versions are available. The default is the latest major version. CloudFormation uses
     *   the latest available *minor* version of the major version selected.
     *
     * You can specify `MajorVersion` or `VersionBump` , but not both.
     */
    public fun majorVersion(majorVersion: String) {
        cdkBuilder.majorVersion(majorVersion)
    }

    /**
     * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension. Conditional:
     *   You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    public fun publicTypeArn(publicTypeArn: String) {
        cdkBuilder.publicTypeArn(publicTypeArn)
    }

    /**
     * @param publisherId The ID of the extension publisher. Conditional: You must specify
     *   `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    public fun publisherId(publisherId: String) {
        cdkBuilder.publisherId(publisherId)
    }

    /**
     * @param type The extension type. Conditional: You must specify `PublicTypeArn` , or `TypeName`
     *   , `Type` , and `PublisherId` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param typeName The name of the extension. Conditional: You must specify `PublicTypeArn` , or
     *   `TypeName` , `Type` , and `PublisherId` .
     */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    /**
     * @param typeNameAlias An alias to assign to the public extension, in this account and Region.
     *   If you specify an alias for the extension, CloudFormation treats the alias as the extension
     *   type name within this account and Region. You must use the alias to refer to the extension
     *   in your templates, API calls, and CloudFormation console.
     *
     * An extension alias must be unique within a given account and Region. You can activate the
     * same public resource multiple times in the same account and Region, using different type name
     * aliases.
     */
    public fun typeNameAlias(typeNameAlias: String) {
        cdkBuilder.typeNameAlias(typeNameAlias)
    }

    /**
     * @param versionBump Manually updates a previously-activated type to a new major or minor
     *   version, if available. You can also use this parameter to update the value of `AutoUpdate`
     *   .
     * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
     *   available.
     * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
     *   available.
     */
    public fun versionBump(versionBump: String) {
        cdkBuilder.versionBump(versionBump)
    }

    public fun build(): CfnTypeActivationProps = cdkBuilder.build()
}
