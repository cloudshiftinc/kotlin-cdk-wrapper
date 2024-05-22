@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specify an AWS Elastic Beanstalk application by using the AWS::ElasticBeanstalk::Application
 * resource in an AWS CloudFormation template.
 *
 * The AWS::ElasticBeanstalk::Application resource is an AWS Elastic Beanstalk Beanstalk resource
 * type that specifies an Elastic Beanstalk application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .applicationName("applicationName")
 * .description("description")
 * .resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty.builder()
 * .serviceRole("serviceRole")
 * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
 * .maxAgeRule(MaxAgeRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxAgeInDays(123)
 * .build())
 * .maxCountRule(MaxCountRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxCount(123)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.elasticbeanstalk.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.elasticbeanstalk.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * A name for the Elastic Beanstalk application.
   */
  public open fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * A name for the Elastic Beanstalk application.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   * Your description of the application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Your description of the application.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies an application resource lifecycle configuration to prevent your application from
   * accumulating too many versions.
   */
  public open fun resourceLifecycleConfig(): Any? = unwrap(this).getResourceLifecycleConfig()

  /**
   * Specifies an application resource lifecycle configuration to prevent your application from
   * accumulating too many versions.
   */
  public open fun resourceLifecycleConfig(`value`: IResolvable) {
    unwrap(this).setResourceLifecycleConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies an application resource lifecycle configuration to prevent your application from
   * accumulating too many versions.
   */
  public open fun resourceLifecycleConfig(`value`: ApplicationResourceLifecycleConfigProperty) {
    unwrap(this).setResourceLifecycleConfig(`value`.let(ApplicationResourceLifecycleConfigProperty.Companion::unwrap))
  }

  /**
   * Specifies an application resource lifecycle configuration to prevent your application from
   * accumulating too many versions.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9cf1a4cbaab1910dea45c264918fcc9d6b1950269d8e7aa2c70816b9f40eeae0")
  public open
      fun resourceLifecycleConfig(`value`: ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit):
      Unit = resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticbeanstalk.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the Elastic Beanstalk application.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-applicationname)
     * @param applicationName A name for the Elastic Beanstalk application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * Your description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-description)
     * @param description Your description of the application. 
     */
    public fun description(description: String)

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions. 
     */
    public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable)

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions. 
     */
    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty)

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482035bc472cf49d855123d15be5d8eba205afcb19b1f278b2b0fa0a0cea75c3")
    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.Builder
        = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.Builder.create(scope, id)

    /**
     * A name for the Elastic Beanstalk application.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-applicationname)
     * @param applicationName A name for the Elastic Beanstalk application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * Your description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-description)
     * @param description Your description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions. 
     */
    override fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions. 
     */
    override
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(ApplicationResourceLifecycleConfigProperty.Companion::unwrap))
    }

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     * prevent your application from accumulating too many versions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482035bc472cf49d855123d15be5d8eba205afcb19b1f278b2b0fa0a0cea75c3")
    override
        fun resourceLifecycleConfig(resourceLifecycleConfig: ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit):
        Unit =
        resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty(resourceLifecycleConfig))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
  }

  /**
   * Use the `ApplicationResourceLifecycleConfig` property type to specify lifecycle settings for
   * resources that belong to an AWS Elastic Beanstalk application when defining an
   * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
   *
   * The resource lifecycle configuration for an application. Defines lifecycle settings for
   * resources that belong to the application, and the service role that Elastic Beanstalk assumes in
   * order to apply lifecycle settings. The version lifecycle configuration defines lifecycle settings
   * for application versions.
   *
   * `ApplicationResourceLifecycleConfig` is a property of the
   * [AWS::ElasticBeanstalk::Application](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
   * ApplicationResourceLifecycleConfigProperty applicationResourceLifecycleConfigProperty =
   * ApplicationResourceLifecycleConfigProperty.builder()
   * .serviceRole("serviceRole")
   * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
   * .maxAgeRule(MaxAgeRuleProperty.builder()
   * .deleteSourceFromS3(false)
   * .enabled(false)
   * .maxAgeInDays(123)
   * .build())
   * .maxCountRule(MaxCountRuleProperty.builder()
   * .deleteSourceFromS3(false)
   * .enabled(false)
   * .maxCount(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
   */
  public interface ApplicationResourceLifecycleConfigProperty {
    /**
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     *
     * The `ServiceRole` property is required the first time that you provide a
     * `ResourceLifecycleConfig` for the application. After you provide it once, Elastic Beanstalk
     * persists the Service Role with the application, and you don't need to specify it again. You can,
     * however, specify it in subsequent updates to change the Service Role to another value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole)
     */
    public fun serviceRole(): String? = unwrap(this).getServiceRole()

    /**
     * Defines lifecycle settings for application versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-versionlifecycleconfig)
     */
    public fun versionLifecycleConfig(): Any? = unwrap(this).getVersionLifecycleConfig()

    /**
     * A builder for [ApplicationResourceLifecycleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceRole The ARN of an IAM service role that Elastic Beanstalk has permission to
       * assume.
       * The `ServiceRole` property is required the first time that you provide a
       * `ResourceLifecycleConfig` for the application. After you provide it once, Elastic Beanstalk
       * persists the Service Role with the application, and you don't need to specify it again. You
       * can, however, specify it in subsequent updates to change the Service Role to another value.
       */
      public fun serviceRole(serviceRole: String)

      /**
       * @param versionLifecycleConfig Defines lifecycle settings for application versions.
       */
      public fun versionLifecycleConfig(versionLifecycleConfig: IResolvable)

      /**
       * @param versionLifecycleConfig Defines lifecycle settings for application versions.
       */
      public
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty)

      /**
       * @param versionLifecycleConfig Defines lifecycle settings for application versions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ec26b45082d87cdedee6a8ecf9eb940bdda5fe50c941c1d91f7dc2926d0e590")
      public
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.builder()

      /**
       * @param serviceRole The ARN of an IAM service role that Elastic Beanstalk has permission to
       * assume.
       * The `ServiceRole` property is required the first time that you provide a
       * `ResourceLifecycleConfig` for the application. After you provide it once, Elastic Beanstalk
       * persists the Service Role with the application, and you don't need to specify it again. You
       * can, however, specify it in subsequent updates to change the Service Role to another value.
       */
      override fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
      }

      /**
       * @param versionLifecycleConfig Defines lifecycle settings for application versions.
       */
      override fun versionLifecycleConfig(versionLifecycleConfig: IResolvable) {
        cdkBuilder.versionLifecycleConfig(versionLifecycleConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param versionLifecycleConfig Defines lifecycle settings for application versions.
       */
      override
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty) {
        cdkBuilder.versionLifecycleConfig(versionLifecycleConfig.let(ApplicationVersionLifecycleConfigProperty.Companion::unwrap))
      }

      /**
       * @param versionLifecycleConfig Defines lifecycle settings for application versions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ec26b45082d87cdedee6a8ecf9eb940bdda5fe50c941c1d91f7dc2926d0e590")
      override
          fun versionLifecycleConfig(versionLifecycleConfig: ApplicationVersionLifecycleConfigProperty.Builder.() -> Unit):
          Unit =
          versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty(versionLifecycleConfig))

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty,
    ) : CdkObject(cdkObject), ApplicationResourceLifecycleConfigProperty {
      /**
       * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
       *
       * The `ServiceRole` property is required the first time that you provide a
       * `ResourceLifecycleConfig` for the application. After you provide it once, Elastic Beanstalk
       * persists the Service Role with the application, and you don't need to specify it again. You
       * can, however, specify it in subsequent updates to change the Service Role to another value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-servicerole)
       */
      override fun serviceRole(): String? = unwrap(this).getServiceRole()

      /**
       * Defines lifecycle settings for application versions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html#cfn-elasticbeanstalk-application-applicationresourcelifecycleconfig-versionlifecycleconfig)
       */
      override fun versionLifecycleConfig(): Any? = unwrap(this).getVersionLifecycleConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationResourceLifecycleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty):
          ApplicationResourceLifecycleConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationResourceLifecycleConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationResourceLifecycleConfigProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty
    }
  }

  /**
   * Use the `ApplicationVersionLifecycleConfig` property type to specify application version
   * lifecycle settings for an AWS Elastic Beanstalk application when defining an
   * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
   *
   * The application version lifecycle settings for an application. Defines the rules that Elastic
   * Beanstalk applies to an application's versions in order to avoid hitting the per-region limit for
   * application versions.
   *
   * When Elastic Beanstalk deletes an application version from its database, you can no longer
   * deploy that version to an environment. The source bundle remains in S3 unless you configure the
   * rule to delete it.
   *
   * `ApplicationVersionLifecycleConfig` is a property of the
   * [ApplicationResourceLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
   * ApplicationVersionLifecycleConfigProperty applicationVersionLifecycleConfigProperty =
   * ApplicationVersionLifecycleConfigProperty.builder()
   * .maxAgeRule(MaxAgeRuleProperty.builder()
   * .deleteSourceFromS3(false)
   * .enabled(false)
   * .maxAgeInDays(123)
   * .build())
   * .maxCountRule(MaxCountRuleProperty.builder()
   * .deleteSourceFromS3(false)
   * .enabled(false)
   * .maxCount(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
   */
  public interface ApplicationVersionLifecycleConfigProperty {
    /**
     * Specify a max age rule to restrict the length of time that application versions are retained
     * for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxagerule)
     */
    public fun maxAgeRule(): Any? = unwrap(this).getMaxAgeRule()

    /**
     * Specify a max count rule to restrict the number of application versions that are retained for
     * an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxcountrule)
     */
    public fun maxCountRule(): Any? = unwrap(this).getMaxCountRule()

    /**
     * A builder for [ApplicationVersionLifecycleConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxAgeRule Specify a max age rule to restrict the length of time that application
       * versions are retained for an application.
       */
      public fun maxAgeRule(maxAgeRule: IResolvable)

      /**
       * @param maxAgeRule Specify a max age rule to restrict the length of time that application
       * versions are retained for an application.
       */
      public fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty)

      /**
       * @param maxAgeRule Specify a max age rule to restrict the length of time that application
       * versions are retained for an application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8e344a38d91d31ff553c61793f12129834c6d0ac6ac9f30165a6d91a35773e2")
      public fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty.Builder.() -> Unit)

      /**
       * @param maxCountRule Specify a max count rule to restrict the number of application versions
       * that are retained for an application.
       */
      public fun maxCountRule(maxCountRule: IResolvable)

      /**
       * @param maxCountRule Specify a max count rule to restrict the number of application versions
       * that are retained for an application.
       */
      public fun maxCountRule(maxCountRule: MaxCountRuleProperty)

      /**
       * @param maxCountRule Specify a max count rule to restrict the number of application versions
       * that are retained for an application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5329b047fdff494643434301f4d3e60d17af448ae8e1c5f7567c60068618d1c5")
      public fun maxCountRule(maxCountRule: MaxCountRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.builder()

      /**
       * @param maxAgeRule Specify a max age rule to restrict the length of time that application
       * versions are retained for an application.
       */
      override fun maxAgeRule(maxAgeRule: IResolvable) {
        cdkBuilder.maxAgeRule(maxAgeRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maxAgeRule Specify a max age rule to restrict the length of time that application
       * versions are retained for an application.
       */
      override fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty) {
        cdkBuilder.maxAgeRule(maxAgeRule.let(MaxAgeRuleProperty.Companion::unwrap))
      }

      /**
       * @param maxAgeRule Specify a max age rule to restrict the length of time that application
       * versions are retained for an application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8e344a38d91d31ff553c61793f12129834c6d0ac6ac9f30165a6d91a35773e2")
      override fun maxAgeRule(maxAgeRule: MaxAgeRuleProperty.Builder.() -> Unit): Unit =
          maxAgeRule(MaxAgeRuleProperty(maxAgeRule))

      /**
       * @param maxCountRule Specify a max count rule to restrict the number of application versions
       * that are retained for an application.
       */
      override fun maxCountRule(maxCountRule: IResolvable) {
        cdkBuilder.maxCountRule(maxCountRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maxCountRule Specify a max count rule to restrict the number of application versions
       * that are retained for an application.
       */
      override fun maxCountRule(maxCountRule: MaxCountRuleProperty) {
        cdkBuilder.maxCountRule(maxCountRule.let(MaxCountRuleProperty.Companion::unwrap))
      }

      /**
       * @param maxCountRule Specify a max count rule to restrict the number of application versions
       * that are retained for an application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5329b047fdff494643434301f4d3e60d17af448ae8e1c5f7567c60068618d1c5")
      override fun maxCountRule(maxCountRule: MaxCountRuleProperty.Builder.() -> Unit): Unit =
          maxCountRule(MaxCountRuleProperty(maxCountRule))

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty,
    ) : CdkObject(cdkObject), ApplicationVersionLifecycleConfigProperty {
      /**
       * Specify a max age rule to restrict the length of time that application versions are
       * retained for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxagerule)
       */
      override fun maxAgeRule(): Any? = unwrap(this).getMaxAgeRule()

      /**
       * Specify a max count rule to restrict the number of application versions that are retained
       * for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html#cfn-elasticbeanstalk-application-applicationversionlifecycleconfig-maxcountrule)
       */
      override fun maxCountRule(): Any? = unwrap(this).getMaxCountRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationVersionLifecycleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty):
          ApplicationVersionLifecycleConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationVersionLifecycleConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationVersionLifecycleConfigProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty
    }
  }

  /**
   * Use the `MaxAgeRule` property type to specify a max age rule to restrict the length of time
   * that application versions are retained for an AWS Elastic Beanstalk application when defining an
   * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
   *
   * A lifecycle rule that deletes application versions after the specified number of days.
   *
   * `MaxAgeRule` is a property of the
   * [ApplicationVersionLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
   * MaxAgeRuleProperty maxAgeRuleProperty = MaxAgeRuleProperty.builder()
   * .deleteSourceFromS3(false)
   * .enabled(false)
   * .maxAgeInDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html)
   */
  public interface MaxAgeRuleProperty {
    /**
     * Set to `true` to delete a version's source bundle from Amazon S3 when Elastic Beanstalk
     * deletes the application version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3)
     */
    public fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

    /**
     * Specify `true` to apply the rule, or `false` to disable it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specify the number of days to retain an application versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays)
     */
    public fun maxAgeInDays(): Number? = unwrap(this).getMaxAgeInDays()

    /**
     * A builder for [MaxAgeRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      public fun deleteSourceFromS3(deleteSourceFromS3: Boolean)

      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable)

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param maxAgeInDays Specify the number of days to retain an application versions.
       */
      public fun maxAgeInDays(maxAgeInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.builder()

      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      override fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
      }

      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      override fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maxAgeInDays Specify the number of days to retain an application versions.
       */
      override fun maxAgeInDays(maxAgeInDays: Number) {
        cdkBuilder.maxAgeInDays(maxAgeInDays)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty,
    ) : CdkObject(cdkObject), MaxAgeRuleProperty {
      /**
       * Set to `true` to delete a version's source bundle from Amazon S3 when Elastic Beanstalk
       * deletes the application version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-deletesourcefroms3)
       */
      override fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

      /**
       * Specify `true` to apply the rule, or `false` to disable it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Specify the number of days to retain an application versions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html#cfn-elasticbeanstalk-application-maxagerule-maxageindays)
       */
      override fun maxAgeInDays(): Number? = unwrap(this).getMaxAgeInDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaxAgeRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty):
          MaxAgeRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? MaxAgeRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaxAgeRuleProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty
    }
  }

  /**
   * Use the `MaxAgeRule` property type to specify a max count rule to restrict the number of
   * application versions that are retained for an AWS Elastic Beanstalk application when defining an
   * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
   *
   * A lifecycle rule that deletes the oldest application version when the maximum count is
   * exceeded.
   *
   * `MaxCountRule` is a property of the
   * [ApplicationVersionLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticbeanstalk.*;
   * MaxCountRuleProperty maxCountRuleProperty = MaxCountRuleProperty.builder()
   * .deleteSourceFromS3(false)
   * .enabled(false)
   * .maxCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html)
   */
  public interface MaxCountRuleProperty {
    /**
     * Set to `true` to delete a version's source bundle from Amazon S3 when Elastic Beanstalk
     * deletes the application version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3)
     */
    public fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

    /**
     * Specify `true` to apply the rule, or `false` to disable it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specify the maximum number of application versions to retain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount)
     */
    public fun maxCount(): Number? = unwrap(this).getMaxCount()

    /**
     * A builder for [MaxCountRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      public fun deleteSourceFromS3(deleteSourceFromS3: Boolean)

      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable)

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param maxCount Specify the maximum number of application versions to retain.
       */
      public fun maxCount(maxCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.builder()

      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      override fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
      }

      /**
       * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
       * when Elastic Beanstalk deletes the application version.
       */
      override fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specify `true` to apply the rule, or `false` to disable it.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maxCount Specify the maximum number of application versions to retain.
       */
      override fun maxCount(maxCount: Number) {
        cdkBuilder.maxCount(maxCount)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty,
    ) : CdkObject(cdkObject), MaxCountRuleProperty {
      /**
       * Set to `true` to delete a version's source bundle from Amazon S3 when Elastic Beanstalk
       * deletes the application version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-deletesourcefroms3)
       */
      override fun deleteSourceFromS3(): Any? = unwrap(this).getDeleteSourceFromS3()

      /**
       * Specify `true` to apply the rule, or `false` to disable it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Specify the maximum number of application versions to retain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html#cfn-elasticbeanstalk-application-maxcountrule-maxcount)
       */
      override fun maxCount(): Number? = unwrap(this).getMaxCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaxCountRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty):
          MaxCountRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? MaxCountRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaxCountRuleProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty
    }
  }
}
