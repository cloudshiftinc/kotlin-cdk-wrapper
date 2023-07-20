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

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnApplication
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    public fun definition(definition: CfnApplication.DefinitionProperty) {
        cdkBuilder.definition(definition)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun engineType(engineType: String) {
        cdkBuilder.engineType(engineType)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnApplication = cdkBuilder.build()
}
