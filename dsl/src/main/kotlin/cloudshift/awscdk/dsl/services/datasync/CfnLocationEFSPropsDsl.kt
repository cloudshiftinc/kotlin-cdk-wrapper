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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import software.amazon.awscdk.services.datasync.CfnLocationEFSProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocationEFSPropsDsl {
    private val cdkBuilder: CfnLocationEFSProps.Builder = CfnLocationEFSProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accessPointArn(accessPointArn: String) {
        cdkBuilder.accessPointArn(accessPointArn)
    }

    public fun ec2Config(ec2Config: IResolvable) {
        cdkBuilder.ec2Config(ec2Config)
    }

    public fun ec2Config(ec2Config: CfnLocationEFS.Ec2ConfigProperty) {
        cdkBuilder.ec2Config(ec2Config)
    }

    public fun efsFilesystemArn(efsFilesystemArn: String) {
        cdkBuilder.efsFilesystemArn(efsFilesystemArn)
    }

    public fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String) {
        cdkBuilder.fileSystemAccessRoleArn(fileSystemAccessRoleArn)
    }

    public fun inTransitEncryption(inTransitEncryption: String) {
        cdkBuilder.inTransitEncryption(inTransitEncryption)
    }

    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationEFSProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
