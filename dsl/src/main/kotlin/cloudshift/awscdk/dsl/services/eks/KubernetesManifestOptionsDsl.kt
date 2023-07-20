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
import software.amazon.awscdk.services.eks.AlbScheme
import software.amazon.awscdk.services.eks.KubernetesManifestOptions
import kotlin.Boolean

@CdkDslMarker
public class KubernetesManifestOptionsDsl {
    private val cdkBuilder: KubernetesManifestOptions.Builder = KubernetesManifestOptions.builder()

    public fun ingressAlb(ingressAlb: Boolean) {
        cdkBuilder.ingressAlb(ingressAlb)
    }

    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
        cdkBuilder.ingressAlbScheme(ingressAlbScheme)
    }

    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    public fun skipValidation(skipValidation: Boolean) {
        cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): KubernetesManifestOptions = cdkBuilder.build()
}
