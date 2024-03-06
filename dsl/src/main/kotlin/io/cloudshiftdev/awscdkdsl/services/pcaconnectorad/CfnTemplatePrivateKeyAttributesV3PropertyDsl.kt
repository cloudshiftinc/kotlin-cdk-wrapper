@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Defines the attributes of the private key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * PrivateKeyAttributesV3Property privateKeyAttributesV3Property =
 * PrivateKeyAttributesV3Property.builder()
 * .algorithm("algorithm")
 * .keySpec("keySpec")
 * .keyUsageProperty(KeyUsagePropertyProperty.builder()
 * .propertyFlags(KeyUsagePropertyFlagsProperty.builder()
 * .decrypt(false)
 * .keyAgreement(false)
 * .sign(false)
 * .build())
 * .propertyType("propertyType")
 * .build())
 * .minimalKeyLength(123)
 * // the properties below are optional
 * .cryptoProviders(List.of("cryptoProviders"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyattributesv3.html)
 */
@CdkDslMarker
public class CfnTemplatePrivateKeyAttributesV3PropertyDsl {
    private val cdkBuilder: CfnTemplate.PrivateKeyAttributesV3Property.Builder =
        CfnTemplate.PrivateKeyAttributesV3Property.builder()

    private val _cryptoProviders: MutableList<String> = mutableListOf()

    /** @param algorithm Defines the algorithm used to generate the private key. */
    public fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
    }

    /**
     * @param cryptoProviders Defines the cryptographic providers used to generate the private key.
     */
    public fun cryptoProviders(vararg cryptoProviders: String) {
        _cryptoProviders.addAll(listOf(*cryptoProviders))
    }

    /**
     * @param cryptoProviders Defines the cryptographic providers used to generate the private key.
     */
    public fun cryptoProviders(cryptoProviders: Collection<String>) {
        _cryptoProviders.addAll(cryptoProviders)
    }

    /**
     * @param keySpec Defines the purpose of the private key. Set it to "KEY_EXCHANGE" or
     *   "SIGNATURE" value.
     */
    public fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
    }

    /**
     * @param keyUsageProperty The key usage property defines the purpose of the private key
     *   contained in the certificate. You can specify specific purposes using property flags or all
     *   by using property type ALL.
     */
    public fun keyUsageProperty(keyUsageProperty: IResolvable) {
        cdkBuilder.keyUsageProperty(keyUsageProperty)
    }

    /**
     * @param keyUsageProperty The key usage property defines the purpose of the private key
     *   contained in the certificate. You can specify specific purposes using property flags or all
     *   by using property type ALL.
     */
    public fun keyUsageProperty(keyUsageProperty: CfnTemplate.KeyUsagePropertyProperty) {
        cdkBuilder.keyUsageProperty(keyUsageProperty)
    }

    /** @param minimalKeyLength Set the minimum key length of the private key. */
    public fun minimalKeyLength(minimalKeyLength: Number) {
        cdkBuilder.minimalKeyLength(minimalKeyLength)
    }

    public fun build(): CfnTemplate.PrivateKeyAttributesV3Property {
        if (_cryptoProviders.isNotEmpty()) cdkBuilder.cryptoProviders(_cryptoProviders)
        return cdkBuilder.build()
    }
}
