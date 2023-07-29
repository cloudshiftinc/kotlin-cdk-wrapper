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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnAppProps

/**
 * Properties for defining a `CfnApp`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
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
@CdkDslMarker
public class CfnAppPropsDsl {
    private val cdkBuilder: CfnAppProps.Builder = CfnAppProps.builder()

    private val _dataSources: MutableList<Any> = mutableListOf()

    private val _domains: MutableList<String> = mutableListOf()

    private val _environment: MutableList<Any> = mutableListOf()

    /** @param appSource A `Source` object that specifies the app repository. */
    public fun appSource(appSource: IResolvable) {
        cdkBuilder.appSource(appSource)
    }

    /** @param appSource A `Source` object that specifies the app repository. */
    public fun appSource(appSource: CfnApp.SourceProperty) {
        cdkBuilder.appSource(appSource)
    }

    /**
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /** @param dataSources The app's data source. */
    public fun dataSources(vararg dataSources: Any) {
        _dataSources.addAll(listOf(*dataSources))
    }

    /** @param dataSources The app's data source. */
    public fun dataSources(dataSources: Collection<Any>) {
        _dataSources.addAll(dataSources)
    }

    /** @param dataSources The app's data source. */
    public fun dataSources(dataSources: IResolvable) {
        cdkBuilder.dataSources(dataSources)
    }

    /** @param description A description of the app. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param domains The app virtual host settings, with multiple domains separated by commas. For
     *   example: `'www.example.com, example.com'`
     */
    public fun domains(vararg domains: String) {
        _domains.addAll(listOf(*domains))
    }

    /**
     * @param domains The app virtual host settings, with multiple domains separated by commas. For
     *   example: `'www.example.com, example.com'`
     */
    public fun domains(domains: Collection<String>) {
        _domains.addAll(domains)
    }

    /** @param enableSsl Whether to enable SSL for the app. */
    public fun enableSsl(enableSsl: Boolean) {
        cdkBuilder.enableSsl(enableSsl)
    }

    /** @param enableSsl Whether to enable SSL for the app. */
    public fun enableSsl(enableSsl: IResolvable) {
        cdkBuilder.enableSsl(enableSsl)
    }

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     *   variables to be associated with the app. After you deploy the app, these variables are
     *   defined on the associated app server instance. For more information, see
     *   [Environment Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     *   .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases.
     * Exceeding it will cause an exception with the message, "Environment: is too large (maximum is
     * 20KB)."
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    public fun environment(vararg environment: Any) {
        _environment.addAll(listOf(*environment))
    }

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     *   variables to be associated with the app. After you deploy the app, these variables are
     *   defined on the associated app server instance. For more information, see
     *   [Environment Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     *   .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases.
     * Exceeding it will cause an exception with the message, "Environment: is too large (maximum is
     * 20KB)."
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    public fun environment(environment: Collection<Any>) {
        _environment.addAll(environment)
    }

    /**
     * @param environment An array of `EnvironmentVariable` objects that specify environment
     *   variables to be associated with the app. After you deploy the app, these variables are
     *   defined on the associated app server instance. For more information, see
     *   [Environment Variables](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment)
     *   .
     *
     * There is no specific limit on the number of environment variables. However, the size of the
     * associated data structure - which includes the variables' names, values, and protected flag
     * values - cannot exceed 20 KB. This limit should accommodate most if not all use cases.
     * Exceeding it will cause an exception with the message, "Environment: is too large (maximum is
     * 20KB)."
     *
     * If you have specified one or more environment variables, you cannot modify the stack's Chef
     * version.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /** @param name The app name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param shortname The app's short name. */
    public fun shortname(shortname: String) {
        cdkBuilder.shortname(shortname)
    }

    /** @param sslConfiguration An `SslConfiguration` object with the SSL configuration. */
    public fun sslConfiguration(sslConfiguration: IResolvable) {
        cdkBuilder.sslConfiguration(sslConfiguration)
    }

    /** @param sslConfiguration An `SslConfiguration` object with the SSL configuration. */
    public fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty) {
        cdkBuilder.sslConfiguration(sslConfiguration)
    }

    /** @param stackId The stack ID. */
    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    /**
     * @param type The app type. Each supported type is associated with a particular layer. For
     *   example, PHP applications are associated with a PHP layer. AWS OpsWorks Stacks deploys an
     *   application to those instances that are members of the corresponding layer. If your app
     *   isn't one of the standard types, or you prefer to implement your own Deploy recipes,
     *   specify `other` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAppProps {
        if (_dataSources.isNotEmpty()) cdkBuilder.dataSources(_dataSources)
        if (_domains.isNotEmpty()) cdkBuilder.domains(_domains)
        if (_environment.isNotEmpty()) cdkBuilder.environment(_environment)
        return cdkBuilder.build()
    }
}
