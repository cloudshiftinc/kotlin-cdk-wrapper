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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.CfnNodegroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNodegroupRemoteAccessPropertyDsl {
    private val cdkBuilder: CfnNodegroup.RemoteAccessProperty.Builder =
        CfnNodegroup.RemoteAccessProperty.builder()

    private val _sourceSecurityGroups: MutableList<String> = mutableListOf()

    public fun ec2SshKey(ec2SshKey: String) {
        cdkBuilder.ec2SshKey(ec2SshKey)
    }

    public fun sourceSecurityGroups(vararg sourceSecurityGroups: String) {
        _sourceSecurityGroups.addAll(listOf(*sourceSecurityGroups))
    }

    public fun sourceSecurityGroups(sourceSecurityGroups: Collection<String>) {
        _sourceSecurityGroups.addAll(sourceSecurityGroups)
    }

    public fun build(): CfnNodegroup.RemoteAccessProperty {
        if (_sourceSecurityGroups.isNotEmpty()) cdkBuilder.sourceSecurityGroups(_sourceSecurityGroups)
        return cdkBuilder.build()
    }
}
