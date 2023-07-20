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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPoolAccountRecoverySettingPropertyDsl {
    private val cdkBuilder: CfnUserPool.AccountRecoverySettingProperty.Builder =
        CfnUserPool.AccountRecoverySettingProperty.builder()

    private val _recoveryMechanisms: MutableList<Any> = mutableListOf()

    public fun recoveryMechanisms(vararg recoveryMechanisms: Any) {
        _recoveryMechanisms.addAll(listOf(*recoveryMechanisms))
    }

    public fun recoveryMechanisms(recoveryMechanisms: Collection<Any>) {
        _recoveryMechanisms.addAll(recoveryMechanisms)
    }

    public fun recoveryMechanisms(recoveryMechanisms: IResolvable) {
        cdkBuilder.recoveryMechanisms(recoveryMechanisms)
    }

    public fun build(): CfnUserPool.AccountRecoverySettingProperty {
        if (_recoveryMechanisms.isNotEmpty()) cdkBuilder.recoveryMechanisms(_recoveryMechanisms)
        return cdkBuilder.build()
    }
}
