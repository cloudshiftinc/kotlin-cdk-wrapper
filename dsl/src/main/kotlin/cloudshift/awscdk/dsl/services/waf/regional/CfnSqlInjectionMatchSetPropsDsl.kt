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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSqlInjectionMatchSetPropsDsl {
    private val cdkBuilder: CfnSqlInjectionMatchSetProps.Builder =
        CfnSqlInjectionMatchSetProps.builder()

    private val _sqlInjectionMatchTuples: MutableList<Any> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any) {
        _sqlInjectionMatchTuples.addAll(listOf(*sqlInjectionMatchTuples))
    }

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: Collection<Any>) {
        _sqlInjectionMatchTuples.addAll(sqlInjectionMatchTuples)
    }

    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
        cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
    }

    public fun build(): CfnSqlInjectionMatchSetProps {
        if (_sqlInjectionMatchTuples.isNotEmpty()) {
            cdkBuilder.sqlInjectionMatchTuples(_sqlInjectionMatchTuples)
        }
        return cdkBuilder.build()
    }
}
