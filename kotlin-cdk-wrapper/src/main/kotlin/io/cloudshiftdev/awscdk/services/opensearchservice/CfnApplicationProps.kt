@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

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
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
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
public interface CfnApplicationProps {
  /**
   * List of application configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
   */
  public fun appConfigs(): Any? = unwrap(this).getAppConfigs()

  /**
   * List of data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
   */
  public fun dataSources(): Any? = unwrap(this).getDataSources()

  /**
   * The endpoint URL of an OpenSearch application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-endpoint)
   */
  public fun endpoint(): String? = unwrap(this).getEndpoint()

  /**
   * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
   * enables enabling secure user authentication and access control across multiple data sources.
   *
   * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized user
   * management.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
   */
  public fun iamIdentityCenterOptions(): Any? = unwrap(this).getIamIdentityCenterOptions()

  /**
   * The name of an OpenSearch application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-name)
   */
  public fun name(): String

  /**
   * An arbitrary set of tags (key-value pairs) for this application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appConfigs List of application configurations.
     */
    public fun appConfigs(appConfigs: IResolvable)

    /**
     * @param appConfigs List of application configurations.
     */
    public fun appConfigs(appConfigs: List<Any>)

    /**
     * @param appConfigs List of application configurations.
     */
    public fun appConfigs(vararg appConfigs: Any)

    /**
     * @param dataSources List of data sources.
     */
    public fun dataSources(dataSources: IResolvable)

    /**
     * @param dataSources List of data sources.
     */
    public fun dataSources(dataSources: List<Any>)

    /**
     * @param dataSources List of data sources.
     */
    public fun dataSources(vararg dataSources: Any)

    /**
     * @param endpoint The endpoint URL of an OpenSearch application.
     */
    public fun endpoint(endpoint: String)

    /**
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources.
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     */
    public fun iamIdentityCenterOptions(iamIdentityCenterOptions: IResolvable)

    /**
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources.
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     */
    public
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: CfnApplication.IamIdentityCenterOptionsProperty)

    /**
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources.
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f42d94eb7abdd344814d68c0ac50ae08f9cbc90152e0bb81f6afe1365e52e9f4")
    public
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: CfnApplication.IamIdentityCenterOptionsProperty.Builder.() -> Unit)

    /**
     * @param name The name of an OpenSearch application. 
     */
    public fun name(name: String)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this application.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this application.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.opensearchservice.CfnApplicationProps.builder()

    /**
     * @param appConfigs List of application configurations.
     */
    override fun appConfigs(appConfigs: IResolvable) {
      cdkBuilder.appConfigs(appConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param appConfigs List of application configurations.
     */
    override fun appConfigs(appConfigs: List<Any>) {
      cdkBuilder.appConfigs(appConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param appConfigs List of application configurations.
     */
    override fun appConfigs(vararg appConfigs: Any): Unit = appConfigs(appConfigs.toList())

    /**
     * @param dataSources List of data sources.
     */
    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataSources List of data sources.
     */
    override fun dataSources(dataSources: List<Any>) {
      cdkBuilder.dataSources(dataSources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param dataSources List of data sources.
     */
    override fun dataSources(vararg dataSources: Any): Unit = dataSources(dataSources.toList())

    /**
     * @param endpoint The endpoint URL of an OpenSearch application.
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources.
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     */
    override fun iamIdentityCenterOptions(iamIdentityCenterOptions: IResolvable) {
      cdkBuilder.iamIdentityCenterOptions(iamIdentityCenterOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources.
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     */
    override
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: CfnApplication.IamIdentityCenterOptionsProperty) {
      cdkBuilder.iamIdentityCenterOptions(iamIdentityCenterOptions.let(CfnApplication.IamIdentityCenterOptionsProperty.Companion::unwrap))
    }

    /**
     * @param iamIdentityCenterOptions Settings container for integrating IAM Identity Center with
     * OpenSearch UI applications, which enables enabling secure user authentication and access control
     * across multiple data sources.
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f42d94eb7abdd344814d68c0ac50ae08f9cbc90152e0bb81f6afe1365e52e9f4")
    override
        fun iamIdentityCenterOptions(iamIdentityCenterOptions: CfnApplication.IamIdentityCenterOptionsProperty.Builder.() -> Unit):
        Unit =
        iamIdentityCenterOptions(CfnApplication.IamIdentityCenterOptionsProperty(iamIdentityCenterOptions))

    /**
     * @param name The name of an OpenSearch application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this application.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this application.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.opensearchservice.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * List of application configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-appconfigs)
     */
    override fun appConfigs(): Any? = unwrap(this).getAppConfigs()

    /**
     * List of data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-datasources)
     */
    override fun dataSources(): Any? = unwrap(this).getDataSources()

    /**
     * The endpoint URL of an OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-endpoint)
     */
    override fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
     * enables enabling secure user authentication and access control across multiple data sources.
     *
     * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized
     * user management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-iamidentitycenteroptions)
     */
    override fun iamIdentityCenterOptions(): Any? = unwrap(this).getIamIdentityCenterOptions()

    /**
     * The name of an OpenSearch application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An arbitrary set of tags (key-value pairs) for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-application.html#cfn-opensearchservice-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.opensearchservice.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.CfnApplicationProps
  }
}
