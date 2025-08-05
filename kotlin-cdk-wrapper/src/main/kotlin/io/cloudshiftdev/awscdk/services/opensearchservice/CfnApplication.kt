@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an OpenSearch UI application.
 *
 * For more information, see [Using the OpenSearch user interface in Amazon OpenSearch
 * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/application.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .name("name")
 * // the properties below are optional
 * .appConfigs(List.of(AppConfigProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .dataSources(List.of(DataSourceProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * // the properties below are optional
 * .dataSourceDescription("dataSourceDescription")
 * .build()))
 * .endpoint("endpoint")
 * .iamIdentityCenterOptions(IamIdentityCenterOptionsProperty.builder()
 * .enabled(false)
 * .iamIdentityCenterInstanceArn("iamIdentityCenterInstanceArn")
 * .iamRoleForIdentityCenterApplicationArn("iamRoleForIdentityCenterApplicationArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.opensearchservice.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * List of application configurations.
   */
  public open fun appConfigs(): Any? = unwrap(this).getAppConfigs()

  /**
   * List of application configurations.
   */
  public open fun appConfigs(`value`: IResolvable) {
    unwrap(this).setAppConfigs(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * List of application configurations.
   */
  public open fun appConfigs(`value`: List<Any>) {
    unwrap(this).setAppConfigs(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * List of application configurations.
   */
  public open fun appConfigs(vararg `value`: Any): Unit = appConfigs(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the domain.
   *
   * See [Identifiers for IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/index.html)
   * in *Using AWS Identity and Access Management* for more information.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of an OpenSearch application.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * List of data sources.
   */
  public open fun dataSources(): Any? = unwrap(this).getDataSources()

  /**
   * List of data sources.
   */
  public open fun dataSources(`value`: IResolvable) {
    unwrap(this).setDataSources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * List of data sources.
   */
  public open fun dataSources(`value`: List<Any>) {
    unwrap(this).setDataSources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * List of data sources.
   */
  public open fun dataSources(vararg `value`: Any): Unit = dataSources(`value`.toList())

  /**
   * The endpoint URL of an OpenSearch application.
   */
  public open fun endpoint(): String? = unwrap(this).getEndpoint()

  /**
   * The endpoint URL of an OpenSearch application.
   */
  public open fun endpoint(`value`: String) {
    unwrap(this).setEndpoint(`value`)
  }

  /**
   * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
   * enables enabling secure user authentication and access control across multiple data sources.
   */
  public open fun iamIdentityCenterOptions(): Any? = unwrap(this).getIamIdentityCenterOptions()

  /**
   * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
   * enables enabling secure user authentication and access control across multiple data sources.
   */
  public open fun iamIdentityCenterOptions(`value`: IResolvable) {
    unwrap(this).setIamIdentityCenterOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
   * enables enabling secure user authentication and access control across multiple data sources.
   */
  public open fun iamIdentityCenterOptions(`value`: IamIdentityCenterOptionsProperty) {
    unwrap(this).setIamIdentityCenterOptions(`value`.let(IamIdentityCenterOptionsProperty.Companion::unwrap))
  }

  /**
   * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
   * enables enabling secure user authentication and access control across multiple data sources.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0344eb8fcfdffc61e0fd5697f06a735f3bb88893b5b6a84568fdd4690d8168c")
  public open
      fun iamIdentityCenterOptions(`value`: IamIdentityCenterOptionsProperty.Builder.() -> Unit):
      Unit = iamIdentityCenterOptions(IamIdentityCenterOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of an OpenSearch application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of an OpenSearch application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this application.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An arbitrary set of tags (key-value pairs) for this application.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this application.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchservice.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     * @param appConfigs List of application configurations. 
     */
    public fun appConfigs(appConfigs: IResolvable)

    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     * @param appConfigs List of application configurations. 
     */
    public fun appConfigs(appConfigs: List<Any>)

    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     * @param appConfigs List of application configurations. 
     */
    public fun appConfigs(vararg appConfigs: Any)

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     * @param dataSources List of data sources. 
     */
    public fun dataSources(dataSources: IResolvable)

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     * @param dataSources List of data sources. 
     */
    public fun dataSources(dataSources: List<Any>)

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     * @param dataSources List of data sources. 
     */
    public fun dataSources(vararg dataSources: Any)

    /**
     * The endpoint URL of an OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-endpoint)
     * @param endpoint The endpoint URL of an OpenSearch application. 
     */
    public fun endpoint(endpoint: String)

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources. 
     */
    public fun iamIdentityCenterOptions(iamIdentityCenterOptions: IResolvable)

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources. 
     */
    public fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterOptionsProperty)

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39751e6c0300cc31a3f34f46aff0cbad893d9492779fc1225fe6017a73350be3")
    public
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterOptionsProperty.Builder.() -> Unit)

    /**
     * The name of an OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-name)
     * @param name The name of an OpenSearch application. 
     */
    public fun name(name: String)

    /**
     * An arbitrary set of tags (key-value pairs) for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key-value pairs) for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this application. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CfnApplication.Builder
        = software.amazon.awscdk.services.opensearchservice.CfnApplication.Builder.create(scope, id)

    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     * @param appConfigs List of application configurations. 
     */
    override fun appConfigs(appConfigs: IResolvable) {
      cdkBuilder.appConfigs(appConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     * @param appConfigs List of application configurations. 
     */
    override fun appConfigs(appConfigs: List<Any>) {
      cdkBuilder.appConfigs(appConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     * @param appConfigs List of application configurations. 
     */
    override fun appConfigs(vararg appConfigs: Any): Unit = appConfigs(appConfigs.toList())

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     * @param dataSources List of data sources. 
     */
    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable.Companion::unwrap))
    }

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     * @param dataSources List of data sources. 
     */
    override fun dataSources(dataSources: List<Any>) {
      cdkBuilder.dataSources(dataSources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     * @param dataSources List of data sources. 
     */
    override fun dataSources(vararg dataSources: Any): Unit = dataSources(dataSources.toList())

    /**
     * The endpoint URL of an OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-endpoint)
     * @param endpoint The endpoint URL of an OpenSearch application. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources. 
     */
    override fun iamIdentityCenterOptions(iamIdentityCenterOptions: IResolvable) {
      cdkBuilder.iamIdentityCenterOptions(iamIdentityCenterOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources. 
     */
    override
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterOptionsProperty) {
      cdkBuilder.iamIdentityCenterOptions(iamIdentityCenterOptions.let(IamIdentityCenterOptionsProperty.Companion::unwrap))
    }

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39751e6c0300cc31a3f34f46aff0cbad893d9492779fc1225fe6017a73350be3")
    override
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: IamIdentityCenterOptionsProperty.Builder.() -> Unit):
        Unit = iamIdentityCenterOptions(IamIdentityCenterOptionsProperty(iamIdentityCenterOptions))

    /**
     * The name of an OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-name)
     * @param name The name of an OpenSearch application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.opensearchservice.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchservice.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.opensearchservice.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.opensearchservice.CfnApplication
  }

  /**
   * Configuration settings for an OpenSearch application.
   *
   * For more information, see see [Using the OpenSearch user interface in Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/application.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * AppConfigProperty appConfigProperty = AppConfigProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-appconfig.html)
   */
  public interface AppConfigProperty {
    /**
     * The configuration item to set, such as the admin role for the OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-appconfig.html#cfn-opensearchservice-application-appconfig-key)
     */
    public fun key(): String

    /**
     * The value assigned to the configuration key, such as an IAM user ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-appconfig.html#cfn-opensearchservice-application-appconfig-value)
     */
    public fun `value`(): String

    /**
     * A builder for [AppConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The configuration item to set, such as the admin role for the OpenSearch
       * application. 
       */
      public fun key(key: String)

      /**
       * @param value The value assigned to the configuration key, such as an IAM user ARN. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty.builder()

      /**
       * @param key The configuration item to set, such as the admin role for the OpenSearch
       * application. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value assigned to the configuration key, such as an IAM user ARN. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty,
    ) : CdkObject(cdkObject),
        AppConfigProperty {
      /**
       * The configuration item to set, such as the admin role for the OpenSearch application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-appconfig.html#cfn-opensearchservice-application-appconfig-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value assigned to the configuration key, such as an IAM user ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-appconfig.html#cfn-opensearchservice-application-appconfig-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AppConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty):
          AppConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? AppConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppConfigProperty):
          software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnApplication.AppConfigProperty
    }
  }

  /**
   * Data sources that are associated with an OpenSearch application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
   * .dataSourceArn("dataSourceArn")
   * // the properties below are optional
   * .dataSourceDescription("dataSourceDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-datasource.html)
   */
  public interface DataSourceProperty {
    /**
     * Amazon Resource Name (ARN) format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-datasource.html#cfn-opensearchservice-application-datasource-datasourcearn)
     */
    public fun dataSourceArn(): String

    /**
     * Detailed description of a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-datasource.html#cfn-opensearchservice-application-datasource-datasourcedescription)
     */
    public fun dataSourceDescription(): String? = unwrap(this).getDataSourceDescription()

    /**
     * A builder for [DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceArn Amazon Resource Name (ARN) format. 
       */
      public fun dataSourceArn(dataSourceArn: String)

      /**
       * @param dataSourceDescription Detailed description of a data source.
       */
      public fun dataSourceDescription(dataSourceDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty.builder()

      /**
       * @param dataSourceArn Amazon Resource Name (ARN) format. 
       */
      override fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
      }

      /**
       * @param dataSourceDescription Detailed description of a data source.
       */
      override fun dataSourceDescription(dataSourceDescription: String) {
        cdkBuilder.dataSourceDescription(dataSourceDescription)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty,
    ) : CdkObject(cdkObject),
        DataSourceProperty {
      /**
       * Amazon Resource Name (ARN) format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-datasource.html#cfn-opensearchservice-application-datasource-datasourcearn)
       */
      override fun dataSourceArn(): String = unwrap(this).getDataSourceArn()

      /**
       * Detailed description of a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-datasource.html#cfn-opensearchservice-application-datasource-datasourcedescription)
       */
      override fun dataSourceDescription(): String? = unwrap(this).getDataSourceDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty):
          DataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DataSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnApplication.DataSourceProperty
    }
  }

  /**
   * Configuration settings for IAM Identity Center in an OpenSearch application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * IamIdentityCenterOptionsProperty iamIdentityCenterOptionsProperty =
   * IamIdentityCenterOptionsProperty.builder()
   * .enabled(false)
   * .iamIdentityCenterInstanceArn("iamIdentityCenterInstanceArn")
   * .iamRoleForIdentityCenterApplicationArn("iamRoleForIdentityCenterApplicationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html)
   */
  public interface IamIdentityCenterOptionsProperty {
    /**
     * Indicates whether IAM Identity Center is enabled for the OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html#cfn-opensearchservice-application-iamidentitycenteroptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Amazon Resource Name (ARN) format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html#cfn-opensearchservice-application-iamidentitycenteroptions-iamidentitycenterinstancearn)
     */
    public fun iamIdentityCenterInstanceArn(): String? =
        unwrap(this).getIamIdentityCenterInstanceArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM role assigned to the IAM Identity Center
     * application for the OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html#cfn-opensearchservice-application-iamidentitycenteroptions-iamroleforidentitycenterapplicationarn)
     */
    public fun iamRoleForIdentityCenterApplicationArn(): String? =
        unwrap(this).getIamRoleForIdentityCenterApplicationArn()

    /**
     * A builder for [IamIdentityCenterOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether IAM Identity Center is enabled for the OpenSearch
       * application.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether IAM Identity Center is enabled for the OpenSearch
       * application.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param iamIdentityCenterInstanceArn Amazon Resource Name (ARN) format.
       */
      public fun iamIdentityCenterInstanceArn(iamIdentityCenterInstanceArn: String)

      /**
       * @param iamRoleForIdentityCenterApplicationArn The Amazon Resource Name (ARN) of the IAM
       * role assigned to the IAM Identity Center application for the OpenSearch application.
       */
      public
          fun iamRoleForIdentityCenterApplicationArn(iamRoleForIdentityCenterApplicationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty.builder()

      /**
       * @param enabled Indicates whether IAM Identity Center is enabled for the OpenSearch
       * application.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether IAM Identity Center is enabled for the OpenSearch
       * application.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamIdentityCenterInstanceArn Amazon Resource Name (ARN) format.
       */
      override fun iamIdentityCenterInstanceArn(iamIdentityCenterInstanceArn: String) {
        cdkBuilder.iamIdentityCenterInstanceArn(iamIdentityCenterInstanceArn)
      }

      /**
       * @param iamRoleForIdentityCenterApplicationArn The Amazon Resource Name (ARN) of the IAM
       * role assigned to the IAM Identity Center application for the OpenSearch application.
       */
      override
          fun iamRoleForIdentityCenterApplicationArn(iamRoleForIdentityCenterApplicationArn: String) {
        cdkBuilder.iamRoleForIdentityCenterApplicationArn(iamRoleForIdentityCenterApplicationArn)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty,
    ) : CdkObject(cdkObject),
        IamIdentityCenterOptionsProperty {
      /**
       * Indicates whether IAM Identity Center is enabled for the OpenSearch application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html#cfn-opensearchservice-application-iamidentitycenteroptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Amazon Resource Name (ARN) format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html#cfn-opensearchservice-application-iamidentitycenteroptions-iamidentitycenterinstancearn)
       */
      override fun iamIdentityCenterInstanceArn(): String? =
          unwrap(this).getIamIdentityCenterInstanceArn()

      /**
       * The Amazon Resource Name (ARN) of the IAM role assigned to the IAM Identity Center
       * application for the OpenSearch application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-application-iamidentitycenteroptions.html#cfn-opensearchservice-application-iamidentitycenteroptions-iamroleforidentitycenterapplicationarn)
       */
      override fun iamRoleForIdentityCenterApplicationArn(): String? =
          unwrap(this).getIamRoleForIdentityCenterApplicationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamIdentityCenterOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty):
          IamIdentityCenterOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamIdentityCenterOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamIdentityCenterOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnApplication.IamIdentityCenterOptionsProperty
    }
  }
}
