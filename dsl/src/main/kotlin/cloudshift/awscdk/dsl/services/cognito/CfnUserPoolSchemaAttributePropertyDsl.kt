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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnUserPoolSchemaAttributePropertyDsl {
    private val cdkBuilder: CfnUserPool.SchemaAttributeProperty.Builder =
        CfnUserPool.SchemaAttributeProperty.builder()

    public fun attributeDataType(attributeDataType: String) {
        cdkBuilder.attributeDataType(attributeDataType)
    }

    public fun developerOnlyAttribute(developerOnlyAttribute: Boolean) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
    }

    public fun developerOnlyAttribute(developerOnlyAttribute: IResolvable) {
        cdkBuilder.developerOnlyAttribute(developerOnlyAttribute)
    }

    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun mutable(mutable: IResolvable) {
        cdkBuilder.mutable(mutable)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun numberAttributeConstraints(numberAttributeConstraints: IResolvable) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints)
    }

    public fun numberAttributeConstraints(numberAttributeConstraints: CfnUserPool.NumberAttributeConstraintsProperty) {
        cdkBuilder.numberAttributeConstraints(numberAttributeConstraints)
    }

    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    public fun stringAttributeConstraints(stringAttributeConstraints: IResolvable) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints)
    }

    public fun stringAttributeConstraints(stringAttributeConstraints: CfnUserPool.StringAttributeConstraintsProperty) {
        cdkBuilder.stringAttributeConstraints(stringAttributeConstraints)
    }

    public fun build(): CfnUserPool.SchemaAttributeProperty = cdkBuilder.build()
}
