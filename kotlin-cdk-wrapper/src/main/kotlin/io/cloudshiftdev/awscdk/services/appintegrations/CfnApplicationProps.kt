@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appintegrations.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
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
public interface CfnApplicationProps {
  /**
   * The configuration for where the application should be loaded from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
   */
  public fun applicationSourceConfig(): Any

  /**
   * The description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-description)
   */
  public fun description(): String

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-name)
   */
  public fun name(): String

  /**
   * The namespace of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-namespace)
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The configuration of events or requests that the application has access to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-permissions)
   */
  public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    public fun applicationSourceConfig(applicationSourceConfig: IResolvable)

    /**
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    public
        fun applicationSourceConfig(applicationSourceConfig: CfnApplication.ApplicationSourceConfigProperty)

    /**
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca719de1b3130b3bae35f788adf8865471fc030c93c5aae45f17c5de542b0d70")
    public
        fun applicationSourceConfig(applicationSourceConfig: CfnApplication.ApplicationSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param description The description of the application. 
     */
    public fun description(description: String)

    /**
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * @param namespace The namespace of the application.
     */
    public fun namespace(namespace: String)

    /**
     * @param permissions The configuration of events or requests that the application has access
     * to.
     */
    public fun permissions(permissions: List<String>)

    /**
     * @param permissions The configuration of events or requests that the application has access
     * to.
     */
    public fun permissions(vararg permissions: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.appintegrations.CfnApplicationProps.builder()

    /**
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    override fun applicationSourceConfig(applicationSourceConfig: IResolvable) {
      cdkBuilder.applicationSourceConfig(applicationSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    override
        fun applicationSourceConfig(applicationSourceConfig: CfnApplication.ApplicationSourceConfigProperty) {
      cdkBuilder.applicationSourceConfig(applicationSourceConfig.let(CfnApplication.ApplicationSourceConfigProperty.Companion::unwrap))
    }

    /**
     * @param applicationSourceConfig The configuration for where the application should be loaded
     * from. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca719de1b3130b3bae35f788adf8865471fc030c93c5aae45f17c5de542b0d70")
    override
        fun applicationSourceConfig(applicationSourceConfig: CfnApplication.ApplicationSourceConfigProperty.Builder.() -> Unit):
        Unit =
        applicationSourceConfig(CfnApplication.ApplicationSourceConfigProperty(applicationSourceConfig))

    /**
     * @param description The description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param namespace The namespace of the application.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param permissions The configuration of events or requests that the application has access
     * to.
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * @param permissions The configuration of events or requests that the application has access
     * to.
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * The configuration for where the application should be loaded from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-applicationsourceconfig)
     */
    override fun applicationSourceConfig(): Any = unwrap(this).getApplicationSourceConfig()

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The namespace of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-namespace)
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The configuration of events or requests that the application has access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-permissions)
     */
    override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-application.html#cfn-appintegrations-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.appintegrations.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appintegrations.CfnApplicationProps
  }
}
