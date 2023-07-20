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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnHealthCheckDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHealthCheck.Builder = CfnHealthCheck.Builder.create(scope, id)

    private val _healthCheckTags: MutableList<Any> = mutableListOf()

    public fun healthCheckConfig(healthCheckConfig: IResolvable) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    public fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    public fun healthCheckTags(vararg healthCheckTags: Any) {
        _healthCheckTags.addAll(listOf(*healthCheckTags))
    }

    public fun healthCheckTags(healthCheckTags: Collection<Any>) {
        _healthCheckTags.addAll(healthCheckTags)
    }

    public fun healthCheckTags(healthCheckTags: IResolvable) {
        cdkBuilder.healthCheckTags(healthCheckTags)
    }

    public fun build(): CfnHealthCheck {
        if (_healthCheckTags.isNotEmpty()) cdkBuilder.healthCheckTags(_healthCheckTags)
        return cdkBuilder.build()
    }
}
