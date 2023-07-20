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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.InitUserOptions
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class InitUserOptionsDsl {
    private val cdkBuilder: InitUserOptions.Builder = InitUserOptions.builder()

    private val _groups: MutableList<String> = mutableListOf()

    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    public fun homeDir(homeDir: String) {
        cdkBuilder.homeDir(homeDir)
    }

    public fun userId(userId: Number) {
        cdkBuilder.userId(userId)
    }

    public fun build(): InitUserOptions {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        return cdkBuilder.build()
    }
}
