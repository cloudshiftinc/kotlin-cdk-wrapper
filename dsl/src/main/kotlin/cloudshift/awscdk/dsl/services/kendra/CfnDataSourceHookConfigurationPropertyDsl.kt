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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceHookConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.HookConfigurationProperty.Builder =
        CfnDataSource.HookConfigurationProperty.builder()

    public fun invocationCondition(invocationCondition: IResolvable) {
        cdkBuilder.invocationCondition(invocationCondition)
    }

    public fun invocationCondition(invocationCondition: CfnDataSource.DocumentAttributeConditionProperty) {
        cdkBuilder.invocationCondition(invocationCondition)
    }

    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun build(): CfnDataSource.HookConfigurationProperty = cdkBuilder.build()
}
