@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates and persists an Application resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appintegrations.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .applicationSourceConfig(ApplicationSourceConfigProperty.builder()
 * .externalUrlConfig(ExternalUrlConfigProperty.builder()
 * .accessUrl("accessUrl")
 * // the properties below are optional
 * .approvedOrigins(List.of("approvedOrigins"))
 * .build())
 * .build())
 * .description("description")
 * .name("name")
 * // the properties below are optional
 * .namespace("namespace")
 * .permissions(List.of("permissions"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.appintegrations.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * The configuration for where the application should be loaded from.
   */
  public open fun applicationSourceConfig(): Any = unwrap(this).getApplicationSourceConfig()

  /**
   * The configuration for where the application should be loaded from.
   */
  public open fun applicationSourceConfig(`value`: IResolvable) {
    unwrap(this).setApplicationSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for where the application should be loaded from.
   */
  public open fun applicationSourceConfig(`value`: ApplicationSourceConfigProperty) {
    unwrap(this).setApplicationSourceConfig(`value`.let(ApplicationSourceConfigProperty.Companion::unwrap))
  }

  /**
   * The configuration for where the application should be loaded from.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a35d78581f4ed11eaa4326b54b30476efb0d4f79fdc3e751508a967d541817f")
  public open
      fun applicationSourceConfig(`value`: ApplicationSourceConfigProperty.Builder.() -> Unit): Unit
      = applicationSourceConfig(ApplicationSourceConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the Application.
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * A unique identifier for the Application.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the application.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description of the application.
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
   * The name of the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The namespace of the application.
   */
  public open fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The namespace of the application.
   */
  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  /**
   * The configuration of events or requests that the application has access to.
   */
  public open fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  /**
   * The configuration of events or requests that the application has access to.
   */
  public open fun permissions(`value`: List<String>) {
    unwrap(this).setPermissions(`value`)
  }

  /**
   * The configuration of events or requests that the application has access to.
   */
  public open fun permissions(vararg `value`: String): Unit = permissions(`value`.toList())

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appintegrations.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    public fun applicationSourceConfig(applicationSourceConfig: IResolvable)

    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    public fun applicationSourceConfig(applicationSourceConfig: ApplicationSourceConfigProperty)

    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12d3e5d23e6eb2eb47c70fb5e8fd0efdd764be4a64691b32dd668876eb56d096")
    public
        fun applicationSourceConfig(applicationSourceConfig: ApplicationSourceConfigProperty.Builder.() -> Unit)

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-description)
     * @param description The description of the application. 
     */
    public fun description(description: String)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-name)
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * The namespace of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-namespace)
     * @param namespace The namespace of the application. 
     */
    public fun namespace(namespace: String)

    /**
     * The configuration of events or requests that the application has access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-permissions)
     * @param permissions The configuration of events or requests that the application has access
     * to. 
     */
    public fun permissions(permissions: List<String>)

    /**
     * The configuration of events or requests that the application has access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-permissions)
     * @param permissions The configuration of events or requests that the application has access
     * to. 
     */
    public fun permissions(vararg permissions: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appintegrations.CfnApplication.Builder =
        software.amazon.awscdk.services.appintegrations.CfnApplication.Builder.create(scope, id)

    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    override fun applicationSourceConfig(applicationSourceConfig: IResolvable) {
      cdkBuilder.applicationSourceConfig(applicationSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    override fun applicationSourceConfig(applicationSourceConfig: ApplicationSourceConfigProperty) {
      cdkBuilder.applicationSourceConfig(applicationSourceConfig.let(ApplicationSourceConfigProperty.Companion::unwrap))
    }

    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12d3e5d23e6eb2eb47c70fb5e8fd0efdd764be4a64691b32dd668876eb56d096")
    override
        fun applicationSourceConfig(applicationSourceConfig: ApplicationSourceConfigProperty.Builder.() -> Unit):
        Unit = applicationSourceConfig(ApplicationSourceConfigProperty(applicationSourceConfig))

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-description)
     * @param description The description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-name)
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The namespace of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-namespace)
     * @param namespace The namespace of the application. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * The configuration of events or requests that the application has access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-permissions)
     * @param permissions The configuration of events or requests that the application has access
     * to. 
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * The configuration of events or requests that the application has access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-permissions)
     * @param permissions The configuration of events or requests that the application has access
     * to. 
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appintegrations.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.appintegrations.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnApplication
  }

  /**
   * The configuration for where the application should be loaded from.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appintegrations.*;
   * ApplicationSourceConfigProperty applicationSourceConfigProperty =
   * ApplicationSourceConfigProperty.builder()
   * .externalUrlConfig(ExternalUrlConfigProperty.builder()
   * .accessUrl("accessUrl")
   * // the properties below are optional
   * .approvedOrigins(List.of("approvedOrigins"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-applicationsourceconfig.html)
   */
  public interface ApplicationSourceConfigProperty {
    /**
     * The external URL source for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-applicationsourceconfig.html#cfn-appintegrations-application-applicationsourceconfig-externalurlconfig)
     */
    public fun externalUrlConfig(): Any

    /**
     * A builder for [ApplicationSourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param externalUrlConfig The external URL source for the application. 
       */
      public fun externalUrlConfig(externalUrlConfig: IResolvable)

      /**
       * @param externalUrlConfig The external URL source for the application. 
       */
      public fun externalUrlConfig(externalUrlConfig: ExternalUrlConfigProperty)

      /**
       * @param externalUrlConfig The external URL source for the application. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("856f068cc35b11f5918ce0732066c05bb1f876f3799bf07f66ce34140b205851")
      public fun externalUrlConfig(externalUrlConfig: ExternalUrlConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty.builder()

      /**
       * @param externalUrlConfig The external URL source for the application. 
       */
      override fun externalUrlConfig(externalUrlConfig: IResolvable) {
        cdkBuilder.externalUrlConfig(externalUrlConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param externalUrlConfig The external URL source for the application. 
       */
      override fun externalUrlConfig(externalUrlConfig: ExternalUrlConfigProperty) {
        cdkBuilder.externalUrlConfig(externalUrlConfig.let(ExternalUrlConfigProperty.Companion::unwrap))
      }

      /**
       * @param externalUrlConfig The external URL source for the application. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("856f068cc35b11f5918ce0732066c05bb1f876f3799bf07f66ce34140b205851")
      override
          fun externalUrlConfig(externalUrlConfig: ExternalUrlConfigProperty.Builder.() -> Unit):
          Unit = externalUrlConfig(ExternalUrlConfigProperty(externalUrlConfig))

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty,
    ) : CdkObject(cdkObject), ApplicationSourceConfigProperty {
      /**
       * The external URL source for the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-applicationsourceconfig.html#cfn-appintegrations-application-applicationsourceconfig-externalurlconfig)
       */
      override fun externalUrlConfig(): Any = unwrap(this).getExternalUrlConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty):
          ApplicationSourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationSourceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSourceConfigProperty):
          software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnApplication.ApplicationSourceConfigProperty
    }
  }

  /**
   * The external URL source for the application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appintegrations.*;
   * ExternalUrlConfigProperty externalUrlConfigProperty = ExternalUrlConfigProperty.builder()
   * .accessUrl("accessUrl")
   * // the properties below are optional
   * .approvedOrigins(List.of("approvedOrigins"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-externalurlconfig.html)
   */
  public interface ExternalUrlConfigProperty {
    /**
     * The URL to access the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-externalurlconfig.html#cfn-appintegrations-application-externalurlconfig-accessurl)
     */
    public fun accessUrl(): String

    /**
     * Additional URLs to allow list if different than the access URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-externalurlconfig.html#cfn-appintegrations-application-externalurlconfig-approvedorigins)
     */
    public fun approvedOrigins(): List<String> = unwrap(this).getApprovedOrigins() ?: emptyList()

    /**
     * A builder for [ExternalUrlConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessUrl The URL to access the application. 
       */
      public fun accessUrl(accessUrl: String)

      /**
       * @param approvedOrigins Additional URLs to allow list if different than the access URL.
       */
      public fun approvedOrigins(approvedOrigins: List<String>)

      /**
       * @param approvedOrigins Additional URLs to allow list if different than the access URL.
       */
      public fun approvedOrigins(vararg approvedOrigins: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty.builder()

      /**
       * @param accessUrl The URL to access the application. 
       */
      override fun accessUrl(accessUrl: String) {
        cdkBuilder.accessUrl(accessUrl)
      }

      /**
       * @param approvedOrigins Additional URLs to allow list if different than the access URL.
       */
      override fun approvedOrigins(approvedOrigins: List<String>) {
        cdkBuilder.approvedOrigins(approvedOrigins)
      }

      /**
       * @param approvedOrigins Additional URLs to allow list if different than the access URL.
       */
      override fun approvedOrigins(vararg approvedOrigins: String): Unit =
          approvedOrigins(approvedOrigins.toList())

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty,
    ) : CdkObject(cdkObject), ExternalUrlConfigProperty {
      /**
       * The URL to access the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-externalurlconfig.html#cfn-appintegrations-application-externalurlconfig-accessurl)
       */
      override fun accessUrl(): String = unwrap(this).getAccessUrl()

      /**
       * Additional URLs to allow list if different than the access URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-application-externalurlconfig.html#cfn-appintegrations-application-externalurlconfig-approvedorigins)
       */
      override fun approvedOrigins(): List<String> = unwrap(this).getApprovedOrigins() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExternalUrlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty):
          ExternalUrlConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExternalUrlConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExternalUrlConfigProperty):
          software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnApplication.ExternalUrlConfigProperty
    }
  }
}
