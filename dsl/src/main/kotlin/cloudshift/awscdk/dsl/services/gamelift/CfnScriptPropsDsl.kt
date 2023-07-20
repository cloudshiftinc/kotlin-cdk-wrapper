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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScriptPropsDsl {
    private val cdkBuilder: CfnScriptProps.Builder = CfnScriptProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    public fun storageLocation(storageLocation: CfnScript.S3LocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnScriptProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
