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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelPackageValidationSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ValidationSpecificationProperty.Builder =
        CfnModelPackage.ValidationSpecificationProperty.builder()

    private val _validationProfiles: MutableList<Any> = mutableListOf()

    public fun validationProfiles(vararg validationProfiles: Any) {
        _validationProfiles.addAll(listOf(*validationProfiles))
    }

    public fun validationProfiles(validationProfiles: Collection<Any>) {
        _validationProfiles.addAll(validationProfiles)
    }

    public fun validationProfiles(validationProfiles: IResolvable) {
        cdkBuilder.validationProfiles(validationProfiles)
    }

    public fun validationRole(validationRole: String) {
        cdkBuilder.validationRole(validationRole)
    }

    public fun build(): CfnModelPackage.ValidationSpecificationProperty {
        if (_validationProfiles.isNotEmpty()) cdkBuilder.validationProfiles(_validationProfiles)
        return cdkBuilder.build()
    }
}
