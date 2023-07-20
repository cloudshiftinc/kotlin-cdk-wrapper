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

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnByteMatchSetPropsDsl {
    private val cdkBuilder: CfnByteMatchSetProps.Builder = CfnByteMatchSetProps.builder()

    private val _byteMatchTuples: MutableList<Any> = mutableListOf()

    public fun byteMatchTuples(vararg byteMatchTuples: Any) {
        _byteMatchTuples.addAll(listOf(*byteMatchTuples))
    }

    public fun byteMatchTuples(byteMatchTuples: Collection<Any>) {
        _byteMatchTuples.addAll(byteMatchTuples)
    }

    public fun byteMatchTuples(byteMatchTuples: IResolvable) {
        cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnByteMatchSetProps {
        if (_byteMatchTuples.isNotEmpty()) cdkBuilder.byteMatchTuples(_byteMatchTuples)
        return cdkBuilder.build()
    }
}
