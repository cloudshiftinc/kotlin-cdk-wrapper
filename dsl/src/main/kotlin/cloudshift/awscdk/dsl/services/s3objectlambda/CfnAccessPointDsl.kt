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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnAccessPointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
        cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
    }

    public fun objectLambdaConfiguration(objectLambdaConfiguration: CfnAccessPoint.ObjectLambdaConfigurationProperty) {
        cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration)
    }

    public fun build(): CfnAccessPoint = cdkBuilder.build()
}
