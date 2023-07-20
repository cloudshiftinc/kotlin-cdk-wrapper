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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.CustomActionProperty
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CustomActionPropertyDsl {
    private val cdkBuilder: CustomActionProperty.Builder = CustomActionProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun key(key: Boolean) {
        cdkBuilder.key(key)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun queryable(queryable: Boolean) {
        cdkBuilder.queryable(queryable)
    }

    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    public fun secret(secret: Boolean) {
        cdkBuilder.secret(secret)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CustomActionProperty = cdkBuilder.build()
}
