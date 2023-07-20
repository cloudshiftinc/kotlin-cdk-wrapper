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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CfnDocument
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDocumentAttachmentsSourcePropertyDsl {
    private val cdkBuilder: CfnDocument.AttachmentsSourceProperty.Builder =
        CfnDocument.AttachmentsSourceProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnDocument.AttachmentsSourceProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
