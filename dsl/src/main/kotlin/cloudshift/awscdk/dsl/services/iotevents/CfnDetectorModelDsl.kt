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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDetectorModelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDetectorModel.Builder = CfnDetectorModel.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
        cdkBuilder.detectorModelDefinition(detectorModelDefinition)
    }

    public fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty) {
        cdkBuilder.detectorModelDefinition(detectorModelDefinition)
    }

    public fun detectorModelDescription(detectorModelDescription: String) {
        cdkBuilder.detectorModelDescription(detectorModelDescription)
    }

    public fun detectorModelName(detectorModelName: String) {
        cdkBuilder.detectorModelName(detectorModelName)
    }

    public fun evaluationMethod(evaluationMethod: String) {
        cdkBuilder.evaluationMethod(evaluationMethod)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetectorModel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
