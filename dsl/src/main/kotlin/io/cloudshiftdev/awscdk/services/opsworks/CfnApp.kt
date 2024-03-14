package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opsworks.CfnApp,
) : CfnResource(cdkObject), IInspectable {
  /**
   * A `Source` object that specifies the app repository.
   */
  public open fun appSource(): Any? = unwrap(this).getAppSource()

  /**
   * A `Source` object that specifies the app repository.
   */
  public open fun appSource(`value`: IResolvable) {
    unwrap(this).setAppSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `Source` object that specifies the app repository.
   */
  public open fun appSource(`value`: SourceProperty) {
    unwrap(this).setAppSource(`value`.let(SourceProperty::unwrap))
  }

  /**
   * A `Source` object that specifies the app repository.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6158ee188c7ca4827de8ef8445ac384a0e88d83642f7f7e15d96b0e6c6e90d3")
  public open fun appSource(`value`: SourceProperty.Builder.() -> Unit): Unit =
      appSource(SourceProperty(`value`))

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * One or more user-defined key/value pairs to be added to the stack attributes.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * One or more user-defined key/value pairs to be added to the stack attributes.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more user-defined key/value pairs to be added to the stack attributes.
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * The app's data source.
   */
  public open fun dataSources(): Any? = unwrap(this).getDataSources()

  /**
   * The app's data source.
   */
  public open fun dataSources(`value`: IResolvable) {
    unwrap(this).setDataSources(`value`.let(IResolvable::unwrap))
  }

  /**
   * The app's data source.
   */
  public open fun dataSources(__idx_ac66f0: List<Any>) {
    unwrap(this).setDataSources(__idx_ac66f0)
  }

  /**
   * The app's data source.
   */
  public open fun dataSources(vararg __idx_ac66f0: Any): Unit = dataSources(__idx_ac66f0.toList())

  /**
   * A description of the app.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the app.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The app virtual host settings, with multiple domains separated by commas.
   */
  public open fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  /**
   * The app virtual host settings, with multiple domains separated by commas.
   */
  public open fun domains(`value`: List<String>) {
    unwrap(this).setDomains(`value`)
  }

  /**
   * The app virtual host settings, with multiple domains separated by commas.
   */
  public open fun domains(vararg `value`: String): Unit = domains(`value`.toList())

  /**
   * Whether to enable SSL for the app.
   */
  public open fun enableSsl(): Any? = unwrap(this).getEnableSsl()

  /**
   * Whether to enable SSL for the app.
   */
  public open fun enableSsl(`value`: Boolean) {
    unwrap(this).setEnableSsl(`value`)
  }

  /**
   * Whether to enable SSL for the app.
   */
  public open fun enableSsl(`value`: IResolvable) {
    unwrap(this).setEnableSsl(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `EnvironmentVariable` objects that specify environment variables to be associated
   * with the app.
   */
  public open fun environment(): Any? = unwrap(this).getEnvironment()

  /**
   * An array of `EnvironmentVariable` objects that specify environment variables to be associated
   * with the app.
   */
  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `EnvironmentVariable` objects that specify environment variables to be associated
   * with the app.
   */
  public open fun environment(__idx_ac66f0: List<Any>) {
    unwrap(this).setEnvironment(__idx_ac66f0)
  }

  /**
   * An array of `EnvironmentVariable` objects that specify environment variables to be associated
   * with the app.
   */
  public open fun environment(vararg __idx_ac66f0: Any): Unit = environment(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The app name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The app name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The app's short name.
   */
  public open fun shortname(): String? = unwrap(this).getShortname()

  /**
   * The app's short name.
   */
  public open fun shortname(`value`: String) {
    unwrap(this).setShortname(`value`)
  }

  /**
   * An `SslConfiguration` object with the SSL configuration.
   */
  public open fun sslConfiguration(): Any? = unwrap(this).getSslConfiguration()

  /**
   * An `SslConfiguration` object with the SSL configuration.
   */
  public open fun sslConfiguration(`value`: IResolvable) {
    unwrap(this).setSslConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * An `SslConfiguration` object with the SSL configuration.
   */
  public open fun sslConfiguration(`value`: SslConfigurationProperty) {
    unwrap(this).setSslConfiguration(`value`.let(SslConfigurationProperty::unwrap))
  }

  /**
   * An `SslConfiguration` object with the SSL configuration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0bc37865226dfa36c7cf7db5774931e6da8fa5e757e99b6c828a9f03e7feb8e5")
  public open fun sslConfiguration(`value`: SslConfigurationProperty.Builder.() -> Unit): Unit =
      sslConfiguration(SslConfigurationProperty(`value`))

  /**
   * The stack ID.
   */
  public open fun stackId(): String = unwrap(this).getStackId()

  /**
   * The stack ID.
   */
  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  /**
   * The app type.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The app type.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opsworks.CfnApp].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     * @param appSource A `Source` object that specifies the app repository. 
     */
    public fun appSource(appSource: IResolvable)

    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     * @param appSource A `Source` object that specifies the app repository. 
     */
    public fun appSource(appSource: SourceProperty)

    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     * @param appSource A `Source` object that specifies the app repository. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3aa2577ee769ad1a0f9c3388fd6b946bca74dfd69b01736579901e5eae2a99b")
    public fun appSource(appSource: SourceProperty.Builder.() -> Unit)

    /**
     * One or more user-defined key/value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * One or more user-defined key/value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes. 
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     * @param dataSources The app's data source. 
     */
    public fun dataSources(dataSources: IResolvable)

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     * @param dataSources The app's data source. 
     */
    public fun dataSources(dataSources: List<Any>)

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     * @param dataSources The app's data source. 
     */
    public fun dataSources(vararg dataSources: Any)

    /**
     * A description of the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
     * @param description A description of the app. 
     */
    public fun description(description: String)

    /**
     * The app virtual host settings, with multiple domains separated by commas.
     *
     * For example: `'www.example.com, example.com'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
     * @param domains The app virtual host settings, with multiple domains separated by commas. 
     */
    public fun domains(domains: List<String>)

    /**
     * The app virtual host settings, with multiple domains separated by commas.
     *
     * For example: `'www.example.com, example.com'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
     * @param domains The app virtual host settings, with multiple domains separated by commas. 
     */
    public fun domains(vararg domains: String)

    /**
     * Whether to enable SSL for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
     * @param enableSsl Whether to enable SSL for the app. 
     */
    public fun enableSsl(enableSsl: Boolean)

    /**
     * Whether to enable SSL for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
     * @param enableSsl Whether to enable SSL for the app. 
     */
    public fun enableSsl(enableSsl: IResolvable)

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
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app. 
     */
    public fun environment(environment: IResolvable)

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
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app. 
     */
    public fun environment(environment: List<Any>)

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
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app. 
     */
    public fun environment(vararg environment: Any)

    /**
     * The app name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
     * @param name The app name. 
     */
    public fun name(name: String)

    /**
     * The app's short name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
     * @param shortname The app's short name. 
     */
    public fun shortname(shortname: String)

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration. 
     */
    public fun sslConfiguration(sslConfiguration: IResolvable)

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration. 
     */
    public fun sslConfiguration(sslConfiguration: SslConfigurationProperty)

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ffc0fd356cd925c8e7bd667c7d7ca5e03fe9f9a58800068d030efba3d77fa39")
    public fun sslConfiguration(sslConfiguration: SslConfigurationProperty.Builder.() -> Unit)

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
     * @param stackId The stack ID. 
     */
    public fun stackId(stackId: String)

    /**
     * The app type.
     *
     * Each supported type is associated with a particular layer. For example, PHP applications are
     * associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that
     * are members of the corresponding layer. If your app isn't one of the standard types, or you
     * prefer to implement your own Deploy recipes, specify `other` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
     * @param type The app type. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnApp.Builder =
        software.amazon.awscdk.services.opsworks.CfnApp.Builder.create(scope, id)

    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     * @param appSource A `Source` object that specifies the app repository. 
     */
    override fun appSource(appSource: IResolvable) {
      cdkBuilder.appSource(appSource.let(IResolvable::unwrap))
    }

    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     * @param appSource A `Source` object that specifies the app repository. 
     */
    override fun appSource(appSource: SourceProperty) {
      cdkBuilder.appSource(appSource.let(SourceProperty::unwrap))
    }

    /**
     * A `Source` object that specifies the app repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-appsource)
     * @param appSource A `Source` object that specifies the app repository. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3aa2577ee769ad1a0f9c3388fd6b946bca74dfd69b01736579901e5eae2a99b")
    override fun appSource(appSource: SourceProperty.Builder.() -> Unit): Unit =
        appSource(SourceProperty(appSource))

    /**
     * One or more user-defined key/value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * One or more user-defined key/value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-attributes)
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     * attributes. 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     * @param dataSources The app's data source. 
     */
    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     * @param dataSources The app's data source. 
     */
    override fun dataSources(dataSources: List<Any>) {
      cdkBuilder.dataSources(dataSources)
    }

    /**
     * The app's data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-datasources)
     * @param dataSources The app's data source. 
     */
    override fun dataSources(vararg dataSources: Any): Unit = dataSources(dataSources.toList())

    /**
     * A description of the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-description)
     * @param description A description of the app. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The app virtual host settings, with multiple domains separated by commas.
     *
     * For example: `'www.example.com, example.com'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
     * @param domains The app virtual host settings, with multiple domains separated by commas. 
     */
    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    /**
     * The app virtual host settings, with multiple domains separated by commas.
     *
     * For example: `'www.example.com, example.com'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-domains)
     * @param domains The app virtual host settings, with multiple domains separated by commas. 
     */
    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    /**
     * Whether to enable SSL for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
     * @param enableSsl Whether to enable SSL for the app. 
     */
    override fun enableSsl(enableSsl: Boolean) {
      cdkBuilder.enableSsl(enableSsl)
    }

    /**
     * Whether to enable SSL for the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-enablessl)
     * @param enableSsl Whether to enable SSL for the app. 
     */
    override fun enableSsl(enableSsl: IResolvable) {
      cdkBuilder.enableSsl(enableSsl.let(IResolvable::unwrap))
    }

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
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app. 
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

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
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app. 
     */
    override fun environment(environment: List<Any>) {
      cdkBuilder.environment(environment)
    }

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
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     * variables to be associated with the app. 
     */
    override fun environment(vararg environment: Any): Unit = environment(environment.toList())

    /**
     * The app name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-name)
     * @param name The app name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The app's short name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-shortname)
     * @param shortname The app's short name. 
     */
    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration. 
     */
    override fun sslConfiguration(sslConfiguration: IResolvable) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(IResolvable::unwrap))
    }

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration. 
     */
    override fun sslConfiguration(sslConfiguration: SslConfigurationProperty) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(SslConfigurationProperty::unwrap))
    }

    /**
     * An `SslConfiguration` object with the SSL configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-sslconfiguration)
     * @param sslConfiguration An `SslConfiguration` object with the SSL configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ffc0fd356cd925c8e7bd667c7d7ca5e03fe9f9a58800068d030efba3d77fa39")
    override fun sslConfiguration(sslConfiguration: SslConfigurationProperty.Builder.() -> Unit):
        Unit = sslConfiguration(SslConfigurationProperty(sslConfiguration))

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-stackid)
     * @param stackId The stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    /**
     * The app type.
     *
     * Each supported type is associated with a particular layer. For example, PHP applications are
     * associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that
     * are members of the corresponding layer. If your app isn't one of the standard types, or you
     * prefer to implement your own Deploy recipes, specify `other` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-app.html#cfn-opsworks-app-type)
     * @param type The app type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnApp = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworks.CfnApp.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.opsworks.CfnApp =
        wrapped.cdkObject
  }

  public interface EnvironmentVariableProperty {
    /**
     * (Required) The environment variable's name, which can consist of up to 64 characters and must
     * be specified.
     *
     * The name can contain upper- and lowercase letters, numbers, and underscores (_), but it must
     * start with a letter or underscore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html#cfn-opsworks-app-environmentvariable-key)
     */
    public fun key(): String

    /**
     * (Optional) Whether the variable's value is returned by the `DescribeApps` action.
     *
     * To hide an environment variable's value, set `Secure` to `true` . `DescribeApps` returns
     * `*****FILTERED*****` instead of the actual value. The default value for `Secure` is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html#cfn-opsworks-app-environmentvariable-secure)
     */
    public fun secure(): Any? = unwrap(this).getSecure()

    /**
     * (Optional) The environment variable's value, which can be left empty.
     *
     * If you specify a value, it can contain up to 256 characters, which must all be printable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html#cfn-opsworks-app-environmentvariable-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key (Required) The environment variable's name, which can consist of up to 64
       * characters and must be specified. 
       * The name can contain upper- and lowercase letters, numbers, and underscores (_), but it
       * must start with a letter or underscore.
       */
      public fun key(key: String)

      /**
       * @param secure (Optional) Whether the variable's value is returned by the `DescribeApps`
       * action.
       * To hide an environment variable's value, set `Secure` to `true` . `DescribeApps` returns
       * `*****FILTERED*****` instead of the actual value. The default value for `Secure` is `false` .
       */
      public fun secure(secure: Boolean)

      /**
       * @param secure (Optional) Whether the variable's value is returned by the `DescribeApps`
       * action.
       * To hide an environment variable's value, set `Secure` to `true` . `DescribeApps` returns
       * `*****FILTERED*****` instead of the actual value. The default value for `Secure` is `false` .
       */
      public fun secure(secure: IResolvable)

      /**
       * @param value (Optional) The environment variable's value, which can be left empty. 
       * If you specify a value, it can contain up to 256 characters, which must all be printable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.builder()

      /**
       * @param key (Required) The environment variable's name, which can consist of up to 64
       * characters and must be specified. 
       * The name can contain upper- and lowercase letters, numbers, and underscores (_), but it
       * must start with a letter or underscore.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param secure (Optional) Whether the variable's value is returned by the `DescribeApps`
       * action.
       * To hide an environment variable's value, set `Secure` to `true` . `DescribeApps` returns
       * `*****FILTERED*****` instead of the actual value. The default value for `Secure` is `false` .
       */
      override fun secure(secure: Boolean) {
        cdkBuilder.secure(secure)
      }

      /**
       * @param secure (Optional) Whether the variable's value is returned by the `DescribeApps`
       * action.
       * To hide an environment variable's value, set `Secure` to `true` . `DescribeApps` returns
       * `*****FILTERED*****` instead of the actual value. The default value for `Secure` is `false` .
       */
      override fun secure(secure: IResolvable) {
        cdkBuilder.secure(secure.let(IResolvable::unwrap))
      }

      /**
       * @param value (Optional) The environment variable's value, which can be left empty. 
       * If you specify a value, it can contain up to 256 characters, which must all be printable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EnvironmentVariableProperty {
      /**
       * (Required) The environment variable's name, which can consist of up to 64 characters and
       * must be specified.
       *
       * The name can contain upper- and lowercase letters, numbers, and underscores (_), but it
       * must start with a letter or underscore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html#cfn-opsworks-app-environmentvariable-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * (Optional) Whether the variable's value is returned by the `DescribeApps` action.
       *
       * To hide an environment variable's value, set `Secure` to `true` . `DescribeApps` returns
       * `*****FILTERED*****` instead of the actual value. The default value for `Secure` is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html#cfn-opsworks-app-environmentvariable-secure)
       */
      override fun secure(): Any? = unwrap(this).getSecure()

      /**
       * (Optional) The environment variable's value, which can be left empty.
       *
       * If you specify a value, it can contain up to 256 characters, which must all be printable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html#cfn-opsworks-app-environmentvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty
    }
  }

  public interface SslConfigurationProperty {
    /**
     * The contents of the certificate's domain.crt file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfiguration-certificate)
     */
    public fun certificate(): String? = unwrap(this).getCertificate()

    /**
     * Optional.
     *
     * Can be used to specify an intermediate certificate authority key or client authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfiguration-chain)
     */
    public fun chain(): String? = unwrap(this).getChain()

    /**
     * The private key;
     *
     * the contents of the certificate's domain.kex file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfiguration-privatekey)
     */
    public fun privateKey(): String? = unwrap(this).getPrivateKey()

    /**
     * A builder for [SslConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificate The contents of the certificate's domain.crt file.
       */
      public fun certificate(certificate: String)

      /**
       * @param chain Optional.
       * Can be used to specify an intermediate certificate authority key or client authentication.
       */
      public fun chain(chain: String)

      /**
       * @param privateKey The private key;.
       * the contents of the certificate's domain.kex file.
       */
      public fun privateKey(privateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.builder()

      /**
       * @param certificate The contents of the certificate's domain.crt file.
       */
      override fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
      }

      /**
       * @param chain Optional.
       * Can be used to specify an intermediate certificate authority key or client authentication.
       */
      override fun chain(chain: String) {
        cdkBuilder.chain(chain)
      }

      /**
       * @param privateKey The private key;.
       * the contents of the certificate's domain.kex file.
       */
      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty,
    ) : CdkObject(cdkObject), SslConfigurationProperty {
      /**
       * The contents of the certificate's domain.crt file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfiguration-certificate)
       */
      override fun certificate(): String? = unwrap(this).getCertificate()

      /**
       * Optional.
       *
       * Can be used to specify an intermediate certificate authority key or client authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfiguration-chain)
       */
      override fun chain(): String? = unwrap(this).getChain()

      /**
       * The private key;
       *
       * the contents of the certificate's domain.kex file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-sslconfiguration.html#cfn-opsworks-app-sslconfiguration-privatekey)
       */
      override fun privateKey(): String? = unwrap(this).getPrivateKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SslConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty):
          SslConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SslConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty
    }
  }

  public interface SourceProperty {
    /**
     * When included in a request, the parameter depends on the repository type.
     *
     * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
     * * For HTTP bundles and Subversion repositories, set `Password` to the password.
     *
     * For more information on how to safely handle IAM credentials, see
     * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
     *
     * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The application's version.
     *
     * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
     * simplest approaches is to have branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-revision)
     */
    public fun revision(): String? = unwrap(this).getRevision()

    /**
     * In requests, the repository's SSH key.
     *
     * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-sshkey)
     */
    public fun sshKey(): String? = unwrap(this).getSshKey()

    /**
     * The repository type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The source URL.
     *
     * The following is an example of an Amazon S3 source URL:
     * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * This parameter depends on the repository type.
     *
     * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
     * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the user
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password When included in a request, the parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
       * * For HTTP bundles and Subversion repositories, set `Password` to the password.
       *
       * For more information on how to safely handle IAM credentials, see
       * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       */
      public fun password(password: String)

      /**
       * @param revision The application's version.
       * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
       * simplest approaches is to have branches or revisions in your repository that represent
       * different versions that can potentially be deployed.
       */
      public fun revision(revision: String)

      /**
       * @param sshKey In requests, the repository's SSH key.
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       */
      public fun sshKey(sshKey: String)

      /**
       * @param type The repository type.
       */
      public fun type(type: String)

      /**
       * @param url The source URL.
       * The following is an example of an Amazon S3 source URL:
       * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
       */
      public fun url(url: String)

      /**
       * @param username This parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
       * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the
       * user name.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder
          = software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.builder()

      /**
       * @param password When included in a request, the parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
       * * For HTTP bundles and Subversion repositories, set `Password` to the password.
       *
       * For more information on how to safely handle IAM credentials, see
       * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param revision The application's version.
       * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
       * simplest approaches is to have branches or revisions in your repository that represent
       * different versions that can potentially be deployed.
       */
      override fun revision(revision: String) {
        cdkBuilder.revision(revision)
      }

      /**
       * @param sshKey In requests, the repository's SSH key.
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       */
      override fun sshKey(sshKey: String) {
        cdkBuilder.sshKey(sshKey)
      }

      /**
       * @param type The repository type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param url The source URL.
       * The following is an example of an Amazon S3 source URL:
       * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      /**
       * @param username This parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
       * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the
       * user name.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      /**
       * When included in a request, the parameter depends on the repository type.
       *
       * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
       * * For HTTP bundles and Subversion repositories, set `Password` to the password.
       *
       * For more information on how to safely handle IAM credentials, see
       * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The application's version.
       *
       * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
       * simplest approaches is to have branches or revisions in your repository that represent
       * different versions that can potentially be deployed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-revision)
       */
      override fun revision(): String? = unwrap(this).getRevision()

      /**
       * In requests, the repository's SSH key.
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-sshkey)
       */
      override fun sshKey(): String? = unwrap(this).getSshKey()

      /**
       * The repository type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The source URL.
       *
       * The following is an example of an Amazon S3 source URL:
       * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-url)
       */
      override fun url(): String? = unwrap(this).getUrl()

      /**
       * This parameter depends on the repository type.
       *
       * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
       * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the
       * user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-source.html#cfn-opsworks-app-source-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty
    }
  }

  public interface DataSourceProperty {
    /**
     * The data source's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * The database name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The data source's type, `AutoSelectOpsworksMysqlInstance` , `OpsworksMysqlInstance` ,
     * `RdsDbInstance` , or `None` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The data source's ARN.
       */
      public fun arn(arn: String)

      /**
       * @param databaseName The database name.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param type The data source's type, `AutoSelectOpsworksMysqlInstance` ,
       * `OpsworksMysqlInstance` , `RdsDbInstance` , or `None` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.builder()

      /**
       * @param arn The data source's ARN.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param databaseName The database name.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param type The data source's type, `AutoSelectOpsworksMysqlInstance` ,
       * `OpsworksMysqlInstance` , `RdsDbInstance` , or `None` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty,
    ) : CdkObject(cdkObject), DataSourceProperty {
      /**
       * The data source's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * The database name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The data source's type, `AutoSelectOpsworksMysqlInstance` , `OpsworksMysqlInstance` ,
       * `RdsDbInstance` , or `None` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html#cfn-opsworks-app-datasource-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty):
          DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty
    }
  }
}
