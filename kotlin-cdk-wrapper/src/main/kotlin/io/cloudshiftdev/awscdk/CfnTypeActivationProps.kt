@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTypeActivation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
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
public interface CfnTypeActivationProps {
  /**
   * Whether to automatically update the extension in this account and Region when a new *minor*
   * version is published by the extension publisher.
   *
   * Major versions released by the publisher must be manually updated.
   *
   * The default is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
   */
  public fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

  /**
   * The name of the IAM execution role to use to activate the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
   */
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * Specifies logging configuration information for an extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
   */
  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * The major version of this extension you want to activate, if multiple major versions are
   * available.
   *
   * The default is the latest major version. CloudFormation uses the latest available *minor*
   * version of the major version selected.
   *
   * You can specify `MajorVersion` or `VersionBump` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-majorversion)
   */
  public fun majorVersion(): String? = unwrap(this).getMajorVersion()

  /**
   * The Amazon Resource Number (ARN) of the public extension.
   *
   * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
   */
  public fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

  /**
   * The ID of the extension publisher.
   *
   * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
   */
  public fun publisherId(): String? = unwrap(this).getPublisherId()

  /**
   * The extension type.
   *
   * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * The name of the extension.
   *
   * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
   */
  public fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * An alias to assign to the public extension, in this account and Region.
   *
   * If you specify an alias for the extension, CloudFormation treats the alias as the extension
   * type name within this account and Region. You must use the alias to refer to the extension in your
   * templates, API calls, and CloudFormation console.
   *
   * An extension alias must be unique within a given account and Region. You can activate the same
   * public resource multiple times in the same account and Region, using different type name aliases.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typenamealias)
   */
  public fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

  /**
   * Manually updates a previously-activated type to a new major or minor version, if available.
   *
   * You can also use this parameter to update the value of `AutoUpdate` .
   *
   * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
   * available.
   * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
   * available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-versionbump)
   */
  public fun versionBump(): String? = unwrap(this).getVersionBump()

  /**
   * A builder for [CfnTypeActivationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher.
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     */
    public fun autoUpdate(autoUpdate: Boolean)

    /**
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher.
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     */
    public fun autoUpdate(autoUpdate: IResolvable)

    /**
     * @param executionRoleArn The name of the IAM execution role to use to activate the extension.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    public fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty)

    /**
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a43028c4e4a24d5dce39383e5610088c9f050dcd993ad7433a85bdddba31300b")
    public
        fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty.Builder.() -> Unit)

    /**
     * @param majorVersion The major version of this extension you want to activate, if multiple
     * major versions are available.
     * The default is the latest major version. CloudFormation uses the latest available *minor*
     * version of the major version selected.
     *
     * You can specify `MajorVersion` or `VersionBump` , but not both.
     */
    public fun majorVersion(majorVersion: String)

    /**
     * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    public fun publicTypeArn(publicTypeArn: String)

    /**
     * @param publisherId The ID of the extension publisher.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    public fun publisherId(publisherId: String)

    /**
     * @param type The extension type.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    public fun type(type: String)

    /**
     * @param typeName The name of the extension.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    public fun typeName(typeName: String)

    /**
     * @param typeNameAlias An alias to assign to the public extension, in this account and Region.
     * If you specify an alias for the extension, CloudFormation treats the alias as the extension
     * type name within this account and Region. You must use the alias to refer to the extension in
     * your templates, API calls, and CloudFormation console.
     *
     * An extension alias must be unique within a given account and Region. You can activate the
     * same public resource multiple times in the same account and Region, using different type name
     * aliases.
     */
    public fun typeNameAlias(typeNameAlias: String)

    /**
     * @param versionBump Manually updates a previously-activated type to a new major or minor
     * version, if available.
     * You can also use this parameter to update the value of `AutoUpdate` .
     *
     * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
     * available.
     * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
     * available.
     */
    public fun versionBump(versionBump: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTypeActivationProps.Builder =
        software.amazon.awscdk.CfnTypeActivationProps.builder()

    /**
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher.
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     */
    override fun autoUpdate(autoUpdate: Boolean) {
      cdkBuilder.autoUpdate(autoUpdate)
    }

    /**
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher.
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     */
    override fun autoUpdate(autoUpdate: IResolvable) {
      cdkBuilder.autoUpdate(autoUpdate.let(IResolvable::unwrap))
    }

    /**
     * @param executionRoleArn The name of the IAM execution role to use to activate the extension.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    override fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnTypeActivation.LoggingConfigProperty::unwrap))
    }

    /**
     * @param loggingConfig Specifies logging configuration information for an extension.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a43028c4e4a24d5dce39383e5610088c9f050dcd993ad7433a85bdddba31300b")
    override
        fun loggingConfig(loggingConfig: CfnTypeActivation.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnTypeActivation.LoggingConfigProperty(loggingConfig))

    /**
     * @param majorVersion The major version of this extension you want to activate, if multiple
     * major versions are available.
     * The default is the latest major version. CloudFormation uses the latest available *minor*
     * version of the major version selected.
     *
     * You can specify `MajorVersion` or `VersionBump` , but not both.
     */
    override fun majorVersion(majorVersion: String) {
      cdkBuilder.majorVersion(majorVersion)
    }

    /**
     * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    override fun publicTypeArn(publicTypeArn: String) {
      cdkBuilder.publicTypeArn(publicTypeArn)
    }

    /**
     * @param publisherId The ID of the extension publisher.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    override fun publisherId(publisherId: String) {
      cdkBuilder.publisherId(publisherId)
    }

    /**
     * @param type The extension type.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param typeName The name of the extension.
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    /**
     * @param typeNameAlias An alias to assign to the public extension, in this account and Region.
     * If you specify an alias for the extension, CloudFormation treats the alias as the extension
     * type name within this account and Region. You must use the alias to refer to the extension in
     * your templates, API calls, and CloudFormation console.
     *
     * An extension alias must be unique within a given account and Region. You can activate the
     * same public resource multiple times in the same account and Region, using different type name
     * aliases.
     */
    override fun typeNameAlias(typeNameAlias: String) {
      cdkBuilder.typeNameAlias(typeNameAlias)
    }

    /**
     * @param versionBump Manually updates a previously-activated type to a new major or minor
     * version, if available.
     * You can also use this parameter to update the value of `AutoUpdate` .
     *
     * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
     * available.
     * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
     * available.
     */
    override fun versionBump(versionBump: String) {
      cdkBuilder.versionBump(versionBump)
    }

    public fun build(): software.amazon.awscdk.CfnTypeActivationProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnTypeActivationProps,
  ) : CdkObject(cdkObject), CfnTypeActivationProps {
    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     */
    override fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

    /**
     * The name of the IAM execution role to use to activate the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
     */
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     */
    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    /**
     * The major version of this extension you want to activate, if multiple major versions are
     * available.
     *
     * The default is the latest major version. CloudFormation uses the latest available *minor*
     * version of the major version selected.
     *
     * You can specify `MajorVersion` or `VersionBump` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-majorversion)
     */
    override fun majorVersion(): String? = unwrap(this).getMajorVersion()

    /**
     * The Amazon Resource Number (ARN) of the public extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
     */
    override fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

    /**
     * The ID of the extension publisher.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
     */
    override fun publisherId(): String? = unwrap(this).getPublisherId()

    /**
     * The extension type.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * The name of the extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
     */
    override fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * An alias to assign to the public extension, in this account and Region.
     *
     * If you specify an alias for the extension, CloudFormation treats the alias as the extension
     * type name within this account and Region. You must use the alias to refer to the extension in
     * your templates, API calls, and CloudFormation console.
     *
     * An extension alias must be unique within a given account and Region. You can activate the
     * same public resource multiple times in the same account and Region, using different type name
     * aliases.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typenamealias)
     */
    override fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

    /**
     * Manually updates a previously-activated type to a new major or minor version, if available.
     *
     * You can also use this parameter to update the value of `AutoUpdate` .
     *
     * * `MAJOR` : CloudFormation updates the extension to the newest major version, if one is
     * available.
     * * `MINOR` : CloudFormation updates the extension to the newest minor version, if one is
     * available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-versionbump)
     */
    override fun versionBump(): String? = unwrap(this).getVersionBump()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTypeActivationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTypeActivationProps):
        CfnTypeActivationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTypeActivationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTypeActivationProps):
        software.amazon.awscdk.CfnTypeActivationProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnTypeActivationProps
  }
}
