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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketOwnershipControlsPropertyDsl {
    private val cdkBuilder: CfnBucket.OwnershipControlsProperty.Builder =
        CfnBucket.OwnershipControlsProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnBucket.OwnershipControlsProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
