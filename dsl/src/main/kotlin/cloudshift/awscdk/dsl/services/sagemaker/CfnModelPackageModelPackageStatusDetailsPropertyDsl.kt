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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelPackageModelPackageStatusDetailsPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder =
        CfnModelPackage.ModelPackageStatusDetailsProperty.builder()

    private val _validationStatuses: MutableList<Any> = mutableListOf()

    public fun validationStatuses(vararg validationStatuses: Any) {
        _validationStatuses.addAll(listOf(*validationStatuses))
    }

    public fun validationStatuses(validationStatuses: Collection<Any>) {
        _validationStatuses.addAll(validationStatuses)
    }

    public fun validationStatuses(validationStatuses: IResolvable) {
        cdkBuilder.validationStatuses(validationStatuses)
    }

    public fun build(): CfnModelPackage.ModelPackageStatusDetailsProperty {
        if (_validationStatuses.isNotEmpty()) cdkBuilder.validationStatuses(_validationStatuses)
        return cdkBuilder.build()
    }
}
