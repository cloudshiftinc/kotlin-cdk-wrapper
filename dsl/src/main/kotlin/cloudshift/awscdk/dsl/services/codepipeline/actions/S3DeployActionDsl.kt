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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CacheControl
import software.amazon.awscdk.services.codepipeline.actions.S3DeployAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class S3DeployActionDsl {
    private val cdkBuilder: S3DeployAction.Builder = S3DeployAction.Builder.create()

    private val _cacheControl: MutableList<CacheControl> = mutableListOf()

    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun cacheControl(vararg cacheControl: CacheControl) {
        _cacheControl.addAll(listOf(*cacheControl))
    }

    public fun cacheControl(cacheControl: Collection<CacheControl>) {
        _cacheControl.addAll(cacheControl)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun extract(extract: Boolean) {
        cdkBuilder.extract(extract)
    }

    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): S3DeployAction {
        if (_cacheControl.isNotEmpty()) cdkBuilder.cacheControl(_cacheControl)
        return cdkBuilder.build()
    }
}
