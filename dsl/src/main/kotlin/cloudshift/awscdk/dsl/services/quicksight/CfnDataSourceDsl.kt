@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

    private val _alternateDataSourceParameters: MutableList<Any> = mutableListOf()

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any) {
        _alternateDataSourceParameters.addAll(listOf(*alternateDataSourceParameters))
    }

    public fun alternateDataSourceParameters(alternateDataSourceParameters: Collection<Any>) {
        _alternateDataSourceParameters.addAll(alternateDataSourceParameters)
    }

    public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
        cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
    }

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    public fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty) {
        cdkBuilder.credentials(credentials)
    }

    public fun dataSourceId(dataSourceId: String) {
        cdkBuilder.dataSourceId(dataSourceId)
    }

    public fun dataSourceParameters(dataSourceParameters: IResolvable) {
        cdkBuilder.dataSourceParameters(dataSourceParameters)
    }

    public fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty) {
        cdkBuilder.dataSourceParameters(dataSourceParameters)
    }

    public fun errorInfo(errorInfo: IResolvable) {
        cdkBuilder.errorInfo(errorInfo)
    }

    public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty) {
        cdkBuilder.errorInfo(errorInfo)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    public fun sslProperties(sslProperties: IResolvable) {
        cdkBuilder.sslProperties(sslProperties)
    }

    public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty) {
        cdkBuilder.sslProperties(sslProperties)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable) {
        cdkBuilder.vpcConnectionProperties(vpcConnectionProperties)
    }

    public fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty) {
        cdkBuilder.vpcConnectionProperties(vpcConnectionProperties)
    }

    public fun build(): CfnDataSource {
        if (_alternateDataSourceParameters.isNotEmpty()) {
            cdkBuilder.alternateDataSourceParameters(_alternateDataSourceParameters)
        }
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
