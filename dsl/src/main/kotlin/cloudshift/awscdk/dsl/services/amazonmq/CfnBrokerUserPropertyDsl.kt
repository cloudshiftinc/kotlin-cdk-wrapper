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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBrokerUserPropertyDsl {
    private val cdkBuilder: CfnBroker.UserProperty.Builder = CfnBroker.UserProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    public fun consoleAccess(consoleAccess: Boolean) {
        cdkBuilder.consoleAccess(consoleAccess)
    }

    public fun consoleAccess(consoleAccess: IResolvable) {
        cdkBuilder.consoleAccess(consoleAccess)
    }

    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnBroker.UserProperty {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        return cdkBuilder.build()
    }
}
