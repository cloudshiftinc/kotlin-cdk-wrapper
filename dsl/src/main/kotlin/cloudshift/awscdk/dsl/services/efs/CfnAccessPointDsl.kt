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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

    private val _accessPointTags: MutableList<CfnAccessPoint.AccessPointTagProperty> = mutableListOf()

    public fun accessPointTags(accessPointTags: CfnAccessPointAccessPointTagPropertyDsl.() -> Unit) {
        _accessPointTags.add(CfnAccessPointAccessPointTagPropertyDsl().apply(accessPointTags).build())
    }

    public fun accessPointTags(accessPointTags: Collection<CfnAccessPoint.AccessPointTagProperty>) {
        _accessPointTags.addAll(accessPointTags)
    }

    public fun clientToken(clientToken: String) {
        cdkBuilder.clientToken(clientToken)
    }

    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    public fun posixUser(posixUser: IResolvable) {
        cdkBuilder.posixUser(posixUser)
    }

    public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty) {
        cdkBuilder.posixUser(posixUser)
    }

    public fun rootDirectory(rootDirectory: IResolvable) {
        cdkBuilder.rootDirectory(rootDirectory)
    }

    public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty) {
        cdkBuilder.rootDirectory(rootDirectory)
    }

    public fun build(): CfnAccessPoint {
        if (_accessPointTags.isNotEmpty()) cdkBuilder.accessPointTags(_accessPointTags)
        return cdkBuilder.build()
    }
}
