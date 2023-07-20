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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterParameterGroupPropsDsl {
    private val cdkBuilder: CfnClusterParameterGroupProps.Builder =
        CfnClusterParameterGroupProps.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun parameterGroupFamily(parameterGroupFamily: String) {
        cdkBuilder.parameterGroupFamily(parameterGroupFamily)
    }

    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnClusterParameterGroupProps {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
