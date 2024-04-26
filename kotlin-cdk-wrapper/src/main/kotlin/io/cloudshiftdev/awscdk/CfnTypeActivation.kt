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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Activates a public third-party extension, making it available for use in stack templates.
 *
 * For more information, see [Using public
 * extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html) in
 * the *AWS CloudFormation User Guide* .
 *
 * Once you have activated a public third-party extension in your account and Region, use
 * [SetTypeConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html)
 * to specify configuration properties for the extension. For more information, see [Configuring
 * extensions at the account
 * level](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-private.html#registry-set-configuration)
 * in the *CloudFormation User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnTypeActivation cfnTypeActivation = CfnTypeActivation.Builder.create(this,
 * "MyCfnTypeActivation")
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
public open class CfnTypeActivation(
  cdkObject: software.amazon.awscdk.CfnTypeActivation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.CfnTypeActivation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTypeActivationProps,
  ) :
      this(software.amazon.awscdk.CfnTypeActivation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTypeActivationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTypeActivationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTypeActivationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the activated extension, in this account and Region.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Whether to automatically update the extension in this account and Region when a new *minor*
   * version is published by the extension publisher.
   */
  public open fun autoUpdate(): Any? = unwrap(this).getAutoUpdate()

  /**
   * Whether to automatically update the extension in this account and Region when a new *minor*
   * version is published by the extension publisher.
   */
  public open fun autoUpdate(`value`: Boolean) {
    unwrap(this).setAutoUpdate(`value`)
  }

  /**
   * Whether to automatically update the extension in this account and Region when a new *minor*
   * version is published by the extension publisher.
   */
  public open fun autoUpdate(`value`: IResolvable) {
    unwrap(this).setAutoUpdate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the IAM execution role to use to activate the extension.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The name of the IAM execution role to use to activate the extension.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies logging configuration information for an extension.
   */
  public open fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  /**
   * Specifies logging configuration information for an extension.
   */
  public open fun loggingConfig(`value`: IResolvable) {
    unwrap(this).setLoggingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies logging configuration information for an extension.
   */
  public open fun loggingConfig(`value`: LoggingConfigProperty) {
    unwrap(this).setLoggingConfig(`value`.let(LoggingConfigProperty::unwrap))
  }

  /**
   * Specifies logging configuration information for an extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc020d77eae03184379c5608f20fb6062211b85169332ef33cf405bc53c8016c")
  public open fun loggingConfig(`value`: LoggingConfigProperty.Builder.() -> Unit): Unit =
      loggingConfig(LoggingConfigProperty(`value`))

  /**
   * The major version of this extension you want to activate, if multiple major versions are
   * available.
   */
  public open fun majorVersion(): String? = unwrap(this).getMajorVersion()

  /**
   * The major version of this extension you want to activate, if multiple major versions are
   * available.
   */
  public open fun majorVersion(`value`: String) {
    unwrap(this).setMajorVersion(`value`)
  }

  /**
   * The Amazon Resource Number (ARN) of the public extension.
   */
  public open fun publicTypeArn(): String? = unwrap(this).getPublicTypeArn()

  /**
   * The Amazon Resource Number (ARN) of the public extension.
   */
  public open fun publicTypeArn(`value`: String) {
    unwrap(this).setPublicTypeArn(`value`)
  }

  /**
   * The ID of the extension publisher.
   */
  public open fun publisherId(): String? = unwrap(this).getPublisherId()

  /**
   * The ID of the extension publisher.
   */
  public open fun publisherId(`value`: String) {
    unwrap(this).setPublisherId(`value`)
  }

  /**
   * The extension type.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The extension type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The name of the extension.
   */
  public open fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The name of the extension.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * An alias to assign to the public extension, in this account and Region.
   */
  public open fun typeNameAlias(): String? = unwrap(this).getTypeNameAlias()

  /**
   * An alias to assign to the public extension, in this account and Region.
   */
  public open fun typeNameAlias(`value`: String) {
    unwrap(this).setTypeNameAlias(`value`)
  }

  /**
   * Manually updates a previously-activated type to a new major or minor version, if available.
   */
  public open fun versionBump(): String? = unwrap(this).getVersionBump()

  /**
   * Manually updates a previously-activated type to a new major or minor version, if available.
   */
  public open fun versionBump(`value`: String) {
    unwrap(this).setVersionBump(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnTypeActivation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher. 
     */
    public fun autoUpdate(autoUpdate: Boolean)

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher. 
     */
    public fun autoUpdate(autoUpdate: IResolvable)

    /**
     * The name of the IAM execution role to use to activate the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
     * @param executionRoleArn The name of the IAM execution role to use to activate the extension. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     * @param loggingConfig Specifies logging configuration information for an extension. 
     */
    public fun loggingConfig(loggingConfig: IResolvable)

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     * @param loggingConfig Specifies logging configuration information for an extension. 
     */
    public fun loggingConfig(loggingConfig: LoggingConfigProperty)

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     * @param loggingConfig Specifies logging configuration information for an extension. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c1bbfec49c9f9961582a67a53408b16796a1f7127dc2abb183cd575761004f7")
    public fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit)

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
     * @param majorVersion The major version of this extension you want to activate, if multiple
     * major versions are available. 
     */
    public fun majorVersion(majorVersion: String)

    /**
     * The Amazon Resource Number (ARN) of the public extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
     * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension. 
     */
    public fun publicTypeArn(publicTypeArn: String)

    /**
     * The ID of the extension publisher.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
     * @param publisherId The ID of the extension publisher. 
     */
    public fun publisherId(publisherId: String)

    /**
     * The extension type.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
     * @param type The extension type. 
     */
    public fun type(type: String)

    /**
     * The name of the extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
     * @param typeName The name of the extension. 
     */
    public fun typeName(typeName: String)

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
     * @param typeNameAlias An alias to assign to the public extension, in this account and Region. 
     */
    public fun typeNameAlias(typeNameAlias: String)

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
     * @param versionBump Manually updates a previously-activated type to a new major or minor
     * version, if available. 
     */
    public fun versionBump(versionBump: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTypeActivation.Builder =
        software.amazon.awscdk.CfnTypeActivation.Builder.create(scope, id)

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher. 
     */
    override fun autoUpdate(autoUpdate: Boolean) {
      cdkBuilder.autoUpdate(autoUpdate)
    }

    /**
     * Whether to automatically update the extension in this account and Region when a new *minor*
     * version is published by the extension publisher.
     *
     * Major versions released by the publisher must be manually updated.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-autoupdate)
     * @param autoUpdate Whether to automatically update the extension in this account and Region
     * when a new *minor* version is published by the extension publisher. 
     */
    override fun autoUpdate(autoUpdate: IResolvable) {
      cdkBuilder.autoUpdate(autoUpdate.let(IResolvable::unwrap))
    }

    /**
     * The name of the IAM execution role to use to activate the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-executionrolearn)
     * @param executionRoleArn The name of the IAM execution role to use to activate the extension. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     * @param loggingConfig Specifies logging configuration information for an extension. 
     */
    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     * @param loggingConfig Specifies logging configuration information for an extension. 
     */
    override fun loggingConfig(loggingConfig: LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfigProperty::unwrap))
    }

    /**
     * Specifies logging configuration information for an extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-loggingconfig)
     * @param loggingConfig Specifies logging configuration information for an extension. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c1bbfec49c9f9961582a67a53408b16796a1f7127dc2abb183cd575761004f7")
    override fun loggingConfig(loggingConfig: LoggingConfigProperty.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfigProperty(loggingConfig))

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
     * @param majorVersion The major version of this extension you want to activate, if multiple
     * major versions are available. 
     */
    override fun majorVersion(majorVersion: String) {
      cdkBuilder.majorVersion(majorVersion)
    }

    /**
     * The Amazon Resource Number (ARN) of the public extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publictypearn)
     * @param publicTypeArn The Amazon Resource Number (ARN) of the public extension. 
     */
    override fun publicTypeArn(publicTypeArn: String) {
      cdkBuilder.publicTypeArn(publicTypeArn)
    }

    /**
     * The ID of the extension publisher.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-publisherid)
     * @param publisherId The ID of the extension publisher. 
     */
    override fun publisherId(publisherId: String) {
      cdkBuilder.publisherId(publisherId)
    }

    /**
     * The extension type.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-type)
     * @param type The extension type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The name of the extension.
     *
     * Conditional: You must specify `PublicTypeArn` , or `TypeName` , `Type` , and `PublisherId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html#cfn-cloudformation-typeactivation-typename)
     * @param typeName The name of the extension. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

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
     * @param typeNameAlias An alias to assign to the public extension, in this account and Region. 
     */
    override fun typeNameAlias(typeNameAlias: String) {
      cdkBuilder.typeNameAlias(typeNameAlias)
    }

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
     * @param versionBump Manually updates a previously-activated type to a new major or minor
     * version, if available. 
     */
    override fun versionBump(versionBump: String) {
      cdkBuilder.versionBump(versionBump)
    }

    public fun build(): software.amazon.awscdk.CfnTypeActivation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnTypeActivation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTypeActivation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTypeActivation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTypeActivation): CfnTypeActivation =
        CfnTypeActivation(cdkObject)

    internal fun unwrap(wrapped: CfnTypeActivation): software.amazon.awscdk.CfnTypeActivation =
        wrapped.cdkObject as software.amazon.awscdk.CfnTypeActivation
  }

  /**
   * Contains logging configuration information for an extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html)
   */
  public interface LoggingConfigProperty {
    /**
     * The Amazon CloudWatch Logs group to which CloudFormation sends error logging information when
     * invoking the extension's handlers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when sending log
     * entries to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-logrolearn)
     */
    public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    /**
     * A builder for [LoggingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends error
       * logging information when invoking the extension's handlers.
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation should
       * assume when sending log entries to CloudWatch Logs.
       */
      public fun logRoleArn(logRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty.Builder
          = software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty.builder()

      /**
       * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends error
       * logging information when invoking the extension's handlers.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation should
       * assume when sending log entries to CloudWatch Logs.
       */
      override fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
      }

      public fun build(): software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty,
    ) : CdkObject(cdkObject), LoggingConfigProperty {
      /**
       * The Amazon CloudWatch Logs group to which CloudFormation sends error logging information
       * when invoking the extension's handlers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      /**
       * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when sending
       * log entries to CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html#cfn-cloudformation-typeactivation-loggingconfig-logrolearn)
       */
      override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty):
          LoggingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty
    }
  }
}
