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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterTlsPropertyDsl {
    private val cdkBuilder: CfnCluster.TlsProperty.Builder = CfnCluster.TlsProperty.builder()

    private val _certificateAuthorityArnList: MutableList<String> = mutableListOf()

    public fun certificateAuthorityArnList(vararg certificateAuthorityArnList: String) {
        _certificateAuthorityArnList.addAll(listOf(*certificateAuthorityArnList))
    }

    public fun certificateAuthorityArnList(certificateAuthorityArnList: Collection<String>) {
        _certificateAuthorityArnList.addAll(certificateAuthorityArnList)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnCluster.TlsProperty {
        if (_certificateAuthorityArnList.isNotEmpty()) {
            cdkBuilder.certificateAuthorityArnList(_certificateAuthorityArnList)
        }
        return cdkBuilder.build()
    }
}
