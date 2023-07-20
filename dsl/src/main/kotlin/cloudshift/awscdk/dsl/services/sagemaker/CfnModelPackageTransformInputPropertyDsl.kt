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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.String

@CdkDslMarker
public class CfnModelPackageTransformInputPropertyDsl {
    private val cdkBuilder: CfnModelPackage.TransformInputProperty.Builder =
        CfnModelPackage.TransformInputProperty.builder()

    public fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
    }

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun dataSource(dataSource: IResolvable) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun dataSource(dataSource: CfnModelPackage.DataSourceProperty) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun splitType(splitType: String) {
        cdkBuilder.splitType(splitType)
    }

    public fun build(): CfnModelPackage.TransformInputProperty = cdkBuilder.build()
}
