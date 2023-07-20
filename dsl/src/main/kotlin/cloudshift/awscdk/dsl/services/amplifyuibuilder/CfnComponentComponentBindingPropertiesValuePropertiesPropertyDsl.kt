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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentComponentBindingPropertiesValuePropertiesPropertyDsl {
    private val cdkBuilder: CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.Builder =
        CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.builder()

    private val _predicates: MutableList<Any> = mutableListOf()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    public fun predicates(vararg predicates: Any) {
        _predicates.addAll(listOf(*predicates))
    }

    public fun predicates(predicates: Collection<Any>) {
        _predicates.addAll(predicates)
    }

    public fun predicates(predicates: IResolvable) {
        cdkBuilder.predicates(predicates)
    }

    public fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
    }

    public fun build(): CfnComponent.ComponentBindingPropertiesValuePropertiesProperty {
        if (_predicates.isNotEmpty()) cdkBuilder.predicates(_predicates)
        return cdkBuilder.build()
    }
}
