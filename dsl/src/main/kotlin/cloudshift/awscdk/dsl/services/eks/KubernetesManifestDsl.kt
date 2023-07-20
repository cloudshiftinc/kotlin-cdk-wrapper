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
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesManifest
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class KubernetesManifestDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: KubernetesManifest.Builder = KubernetesManifest.Builder.create(scope, id)

    private val _manifest: MutableList<Map<String, Any>> = mutableListOf()

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun ingressAlb(ingressAlb: Boolean) {
        cdkBuilder.ingressAlb(ingressAlb)
    }

    public fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
        cdkBuilder.ingressAlbScheme(ingressAlbScheme)
    }

    public fun manifest(vararg manifest: Map<String, Any>) {
        _manifest.addAll(listOf(*manifest))
    }

    public fun manifest(manifest: Collection<Map<String, Any>>) {
        _manifest.addAll(manifest)
    }

    public fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
    }

    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    public fun skipValidation(skipValidation: Boolean) {
        cdkBuilder.skipValidation(skipValidation)
    }

    public fun build(): KubernetesManifest {
        if (_manifest.isNotEmpty()) cdkBuilder.manifest(_manifest)
        return cdkBuilder.build()
    }
}
