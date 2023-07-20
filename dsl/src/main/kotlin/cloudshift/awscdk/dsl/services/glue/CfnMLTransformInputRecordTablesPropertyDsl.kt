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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMLTransformInputRecordTablesPropertyDsl {
    private val cdkBuilder: CfnMLTransform.InputRecordTablesProperty.Builder =
        CfnMLTransform.InputRecordTablesProperty.builder()

    private val _glueTables: MutableList<Any> = mutableListOf()

    public fun glueTables(vararg glueTables: Any) {
        _glueTables.addAll(listOf(*glueTables))
    }

    public fun glueTables(glueTables: Collection<Any>) {
        _glueTables.addAll(glueTables)
    }

    public fun glueTables(glueTables: IResolvable) {
        cdkBuilder.glueTables(glueTables)
    }

    public fun build(): CfnMLTransform.InputRecordTablesProperty {
        if (_glueTables.isNotEmpty()) cdkBuilder.glueTables(_glueTables)
        return cdkBuilder.build()
    }
}
