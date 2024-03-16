@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApp`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * CfnAppProps cfnAppProps = CfnAppProps.builder()
 * .name("name")
 * .stackId("stackId")
 * .type("type")
 * // the properties below are optional
 * .appSource(SourceProperty.builder()
 * .password("password")
 * .revision("revision")
 * .sshKey("sshKey")
 * .type("type")
 * .url("url")
 * .username("username")
 * .build())
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .dataSources(List.of(DataSourceProperty.builder()
 * .arn("arn")
 * .databaseName("databaseName")
 * .type("type")
 * .build()))
 * .description("description")
 * .domains(List.of("domains"))
 * .enableSsl(false)
 * .environment(List.of(EnvironmentVariableProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .secure(false)
 * .build()))
 * .shortname("shortname")
 * .sslConfiguration(SslConfigurationProperty.builder()
 * .certificate("certificate")
 * .chain("chain")
 * .privateKey("privateKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html)
 */
public interface CfnAppProps {
  /**
   * A `Source` object that specifies the app repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
   */
  public fun appSource(): Any? = unwrap(this).getAppSource()

  /**
   * One or more user-defined key/value pairs to be added to the stack attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * The app's data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
   */
  public fun dataSources(): Any? = unwrap(this).getDataSources()

  /**
   * A description of the app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The app virtual host settings, with multiple domains separated by commas.
   *
   * For example: `'www.example.com, example.com'`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
   */
  public fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  /**
   * Whether to enable SSL for the app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
   */
  public fun enableSsl(): Any? = unwrap(this).getEnableSsl()

  /**
   * An array of `EnvironmentVariable` objects that specify environment variables to be associated
   * with the app.
   *
   * After you deploy the app, these variables are defined on the associated app server instance.
   * For more information, see [Environment
   * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
   * .
   *
   * There is no specific limit on the number of environment variables. However, the size of the
   * associated data structure - which includes the variables' names, values, and protected flag
   * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
   * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
   *
   *
   * If you have specified one or more environment variables, you cannot modify the stack's Chef
   * version.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment)
   */
  public fun environment(): Any? = unwrap(this).getEnvironment()

  /**
   * The app name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
   */
  public fun name(): String

  /**
   * The app's short name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
   */
  public fun shortname(): String? = unwrap(this).getShortname()

  /**
   * An `SslConfiguration` object with the SSL configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
   */
  public fun sslConfiguration(): Any? = unwrap(this).getSslConfiguration()

  /**
   * The stack ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
   */
  public fun stackId(): String

  /**
   * The app type.
   *
   * Each supported type is associated with a particular layer. For example, PHP applications are
   * associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that
   * are members of the corresponding layer. If your app isn't one of the standard types, or you prefer
   * to implement your own Deploy recipes, specify `other` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appSource A `Source` object that specifies the app repository.
     */
    public fun appSource(appSource: IResolvable)

    /**
     * @param appSource A `Source` object that specifies the app repository.
     */
    public fun appSource(appSource: CfnApp.SourceProperty)

    /**
     * @param appSource A `Source` object that specifies the app repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad8655435b3d7e559e79a32992a8da593b4b6fccfe141a632618566c5f831827")
    public fun appSource(appSource: CfnApp.SourceProperty.Builder.() -> Unit)

    /**
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes.
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes.
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * @param dataSources The app's data source.
     */
    public fun dataSources(dataSources: IResolvable)

    /**
     * @param dataSources The app's data source.
     */
    public fun dataSources(dataSources: List<Any>)

    /**
     * @param dataSources The app's data source.
     */
    public fun dataSources(vararg dataSources: Any)

    /**
     * @param description A description of the app.
     */
    public fun description(description: String)

    /**
     * @param domains The app virtual host settings, with multiple domains separated by commas.
     * For example: `'www.example.com, example.com'`
     */
    public fun domains(domains: List<String>)

    /**
     * @param domains The app virtual host settings, with multiple domains separated by commas.
     * For example: `'www.example.com, example.com'`
     */
    public fun domains(vararg domains: String)

    /**
     * @param enableSsl Whether to enable SSL for the app.
     */
    public fun enableSsl(enableSsl: Boolean)

    /**
     * @param enableSsl Whether to enable SSL for the app.
     */
    public fun enableSsl(enableSsl: IResolvable)

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app.
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    public fun environment(environment: IResolvable)

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app.
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    public fun environment(environment: List<Any>)

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app.
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    public fun environment(vararg environment: Any)

    /**
     * @param name The app name. 
     */
    public fun name(name: String)

    /**
     * @param shortname The app's short name.
     */
    public fun shortname(shortname: String)

    /**
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration.
     */
    public fun sslConfiguration(sslConfiguration: IResolvable)

    /**
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration.
     */
    public fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty)

    /**
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b22074dcadb3937479a307653c81ec78dda4882c6ded8b2dfdca184fb831c04")
    public
        fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty.Builder.() -> Unit)

    /**
     * @param stackId The stack ID. 
     */
    public fun stackId(stackId: String)

    /**
     * @param type The app type. 
     * Each supported type is associated with a particular layer. For example, PHP applications are
     * associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that
     * are members of the corresponding layer. If your app isn't one of the standard types, or you
     * prefer to implement your own Deploy recipes, specify `other` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnAppProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnAppProps.builder()

    /**
     * @param appSource A `Source` object that specifies the app repository.
     */
    override fun appSource(appSource: IResolvable) {
      cdkBuilder.appSource(appSource.let(IResolvable::unwrap))
    }

    /**
     * @param appSource A `Source` object that specifies the app repository.
     */
    override fun appSource(appSource: CfnApp.SourceProperty) {
      cdkBuilder.appSource(appSource.let(CfnApp.SourceProperty::unwrap))
    }

    /**
     * @param appSource A `Source` object that specifies the app repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad8655435b3d7e559e79a32992a8da593b4b6fccfe141a632618566c5f831827")
    override fun appSource(appSource: CfnApp.SourceProperty.Builder.() -> Unit): Unit =
        appSource(CfnApp.SourceProperty(appSource))

    /**
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes.
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes.
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param dataSources The app's data source.
     */
    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    /**
     * @param dataSources The app's data source.
     */
    override fun dataSources(dataSources: List<Any>) {
      cdkBuilder.dataSources(dataSources)
    }

    /**
     * @param dataSources The app's data source.
     */
    override fun dataSources(vararg dataSources: Any): Unit = dataSources(dataSources.toList())

    /**
     * @param description A description of the app.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domains The app virtual host settings, with multiple domains separated by commas.
     * For example: `'www.example.com, example.com'`
     */
    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    /**
     * @param domains The app virtual host settings, with multiple domains separated by commas.
     * For example: `'www.example.com, example.com'`
     */
    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    /**
     * @param enableSsl Whether to enable SSL for the app.
     */
    override fun enableSsl(enableSsl: Boolean) {
      cdkBuilder.enableSsl(enableSsl)
    }

    /**
     * @param enableSsl Whether to enable SSL for the app.
     */
    override fun enableSsl(enableSsl: IResolvable) {
      cdkBuilder.enableSsl(enableSsl.let(IResolvable::unwrap))
    }

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app.
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app.
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    override fun environment(environment: List<Any>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app.
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    override fun environment(vararg environment: Any): Unit = environment(environment.toList())

    /**
     * @param name The app name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param shortname The app's short name.
     */
    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    /**
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration.
     */
    override fun sslConfiguration(sslConfiguration: IResolvable) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration.
     */
    override fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(CfnApp.SslConfigurationProperty::unwrap))
    }

    /**
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b22074dcadb3937479a307653c81ec78dda4882c6ded8b2dfdca184fb831c04")
    override
        fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty.Builder.() -> Unit):
        Unit = sslConfiguration(CfnApp.SslConfigurationProperty(sslConfiguration))

    /**
     * @param stackId The stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    /**
     * @param type The app type. 
     * Each supported type is associated with a particular layer. For example, PHP applications are
     * associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that
     * are members of the corresponding layer. If your app isn't one of the standard types, or you
     * prefer to implement your own Deploy recipes, specify `other` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     */
    override fun appSource(): Any? = unwrap(this).getAppSource()

    /**
     * One or more user-defined key/value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     */
    override fun dataSources(): Any? = unwrap(this).getDataSources()

    /**
     * A description of the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The app virtual host settings, with multiple domains separated by commas.
     *
     * For example: `'www.example.com, example.com'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
     */
    override fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

    /**
     * Whether to enable SSL for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
     */
    override fun enableSsl(): Any? = unwrap(this).getEnableSsl()

    /**
     * An array of `EnvironmentVariable` objects that specify environment variables to be associated
     * with the app.
     *
     * After you deploy the app, these variables are defined on the associated app server instance.
     * For more information, see [Environment
     * Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     * .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding
     * it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."
     *
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-environment)
     */
    override fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The app name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The app's short name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
     */
    override fun shortname(): String? = unwrap(this).getShortname()

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     */
    override fun sslConfiguration(): Any? = unwrap(this).getSslConfiguration()

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
     */
    override fun stackId(): String = unwrap(this).getStackId()

    /**
     * The app type.
     *
     * Each supported type is associated with a particular layer. For example, PHP applications are
     * associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that
     * are members of the corresponding layer. If your app isn't one of the standard types, or you
     * prefer to implement your own Deploy recipes, specify `other` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnAppProps): CfnAppProps
        = CdkObjectWrappers.wrap(cdkObject) as CfnAppProps

    internal fun unwrap(wrapped: CfnAppProps): software.amazon.awscdk.services.opsworks.CfnAppProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnAppProps
  }
}
